package com.st1.commands;/* com.st1.commands.Command for transitioning between spaces
 */

import com.st1.Context;

public class CommandGo extends BaseCommand implements Command {
  public CommandGo() {
    description = "Følg en vej";
  }
  
  @Override
  public void execute (Context context, String command, String[] parameters) {
    if (guardEq(parameters, 1)) {
      System.out.println("I don't seem to know where that is 🤔");
      return;
    }
    context.transition(parameters[0]);
  }
}
