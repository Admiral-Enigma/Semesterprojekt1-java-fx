package com.st1;

import com.st1.commands.Command;
import com.st1.commands.CommandUnknown;
import com.st1.commands.Registry;
import com.st1.inventory.items.McChicken;
import com.st1.inventory.items.McFeast;
import com.st1.inventory.items.SMRGenerator;
import com.st1.inventory.items.Thorium;
import com.st1.util.TextPrinter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class Game extends Application {
    public static GameState state = GameState.IN_CONTEXT;
    public static NewReactorState newReactorState = new NewReactorState();
    static World    world    = new World();
    public static Context  context  = new Context(world.getEntry());
    static Command fallback = new CommandUnknown();
    static Registry registry = new Registry(context, fallback);

    public static TextPrinter textPrinter = new TextPrinter();

    @Override
    public void start(Stage stage) throws IOException {

        context.getCurrent().welcome();


        FXMLLoader fxmlLoader = new FXMLLoader(Game.class.getResource("scenes/start-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 700);
        stage.setTitle("Yurigistan Nuclear Bonanza");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();

        Context.inventory.add(new McFeast());
        Context.inventory.add(new McChicken());
        Context.inventory.add(new SMRGenerator());


        /*
        initRegistry();

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
        }*/

    }

    public static void main(String[] args) {
        launch();
    }
}