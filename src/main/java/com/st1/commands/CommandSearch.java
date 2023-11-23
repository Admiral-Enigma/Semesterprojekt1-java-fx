package com.st1.commands;

import com.st1.core.Context;
import com.st1.core.Space;

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