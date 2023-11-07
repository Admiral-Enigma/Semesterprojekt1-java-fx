package com.st1.old.st1;/* Main class for launching the game
 */

import com.st1.Context;
import com.st1.GameState;
import com.st1.NewReactorState;
import com.st1.World;
import com.st1.commands.*;
import com.st1.interact.BaseNpc;
import com.st1.interact.HasQuiz;
import com.st1.interact.quiz.Quiz;
import com.st1.inventory.UsableItem;

import java.util.Scanner;

public class Game {

  public static GameState state = GameState.IN_CONTEXT;
  public static NewReactorState newReactorState = new NewReactorState();
  static World world    = new World();
  public static Context context  = new Context(world.getEntry());
  static Command  fallback = new CommandUnknown();
  static Registry registry = new Registry(context, fallback);
  static Scanner  scanner  = new Scanner(System.in);
  
  private static void initRegistry () {
    Command cmdExit = new CommandExit();
    registry.register("exit", cmdExit);
    registry.register("quit", cmdExit);
    registry.register("go", new CommandGo());
    registry.register("pickup", new CommandPickup());
    registry.register("help", new CommandHelp(registry));
    registry.register("use", new CommandUse());
    registry.register("place", new CommandPlace());
    registry.register("inventory", new CommandInventory());
    registry.register("search", new CommandSearch());
  }
  
  public static void main (String args[]) {
    initRegistry();
    context.getCurrent().welcome();
    
    while (Game.state == GameState.IN_CONTEXT || Game.state == GameState.IN_QUIZ) {
      // Spillet er i normal state hvor man kan bruge commands osv
      if (Game.state == GameState.IN_CONTEXT) {
        System.out.print(context.getCurrent().name + " > ");
        String line = scanner.nextLine();
        registry.dispatch(line);
        continue;
      }

      // Spilleren er i gang med en Quiz hvor man kun kan svare på spørgsmål
      if (Game.state == GameState.IN_QUIZ) {
        System.out.print("Svar > ");
        String line = scanner.nextLine();
        HasQuiz currentNpc = (HasQuiz) context.getCurrent().getNpc();
        boolean quizDone = currentNpc.getQuiz().processAnswer(line);

        // Quiz er nu færdig, return til det normale context state og kald onQuizComplete på den relevante npc
        if (quizDone) {
          Game.state = GameState.IN_CONTEXT;
          currentNpc.onQuizComplete();
          context.getCurrent().welcome();
        }
      }
    }

    if (Game.state == GameState.QUIT) {
      System.out.println("com.st1.Game Over 😥");
    } else {
      System.out.println("Tillykke, du har vundet");
    }
  }
}
