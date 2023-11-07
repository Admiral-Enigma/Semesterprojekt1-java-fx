package com.st1.commands;/* Baseclass for com.st1.commands
 */

public class BaseCommand {
  String description = "Undocumented";
  
  protected boolean guardEq (String[] parameters, int bound) {
    return parameters.length!=bound;
  }
  
  public String getDescription () {
    return description;
  }
}
