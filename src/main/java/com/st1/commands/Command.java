package com.st1.commands;

import com.st1.core.Context;

public interface Command {
  void execute (Context context, String command, String parameters[]);
  String getDescription ();
}

