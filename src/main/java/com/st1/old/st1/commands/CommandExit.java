package com.st1.old.st1.commands;
import com.st1.Context;
import com.st1.Game;
import com.st1.GameState;

public class CommandExit extends BaseCommand implements Command {
  public CommandExit(){description = "Forlad spillet";}
  @Override
  public void execute (Context context, String command, String parameters[]) {
    Game.state = GameState.QUIT;
  }
}
