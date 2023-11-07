package com.st1.commands;

import com.st1.Context;

public class CommandUnknown extends BaseCommand implements Command {
  @Override
  public void execute (Context context, String command, String parameters[]) {
    System.out.println("Hov, jeg forstår ikke '"+command+"' 😕");
  }
}
