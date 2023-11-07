package com.st1.old.st1.commands;

import com.st1.Context;

import java.util.Arrays;

public class CommandHelp extends BaseCommand implements Command {
  Registry registry;
  
  public CommandHelp(Registry registry) {
    this.registry = registry;
    this.description = "Display en liste over commands";
  }
  
  @Override
  public void execute (Context context, String command, String[] parameters) {
    String[] commandNames = registry.getCommandNames();
    Arrays.sort(commandNames);
    
    // find max length of command name
    int max = 0;
    for (String commandName: commandNames) {
      int length = commandName.length();
      if (length>max) max = length;
    }
    
    // present list of com.st1.commands
    System.out.println("Commands:");
    for (String commandName: commandNames) {
      String description = registry.getCommand(commandName).getDescription();
      System.out.printf(" - %-"+max+"s %s%n", commandName, description);
    }
  }
}
