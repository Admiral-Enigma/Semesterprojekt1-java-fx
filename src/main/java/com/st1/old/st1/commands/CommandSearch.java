package com.st1.old.st1.commands;

import com.st1.Context;
import com.st1.Space;

public class CommandSearch extends BaseCommand implements Command {
    public CommandSearch() {
        description = "Gennemsøg rummet";
    }
    @Override
    public void execute(Context context, String command, String[] parameters) {
        Space current = context.getCurrent();

        current.listItems();
    }
}