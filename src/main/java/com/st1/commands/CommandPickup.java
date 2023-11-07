package com.st1.commands;

import com.st1.Context;
import com.st1.inventory.Item;

public class CommandPickup extends BaseCommand implements Command{
    public CommandPickup(){description = "saml et item op";}
    @Override
    public void execute(Context context, String command, String[] parameters) {

        if (guardEq(parameters, 1)) {
            System.out.println("Missing a item to pickup");
            return;
        }

        if (!context.getCurrent().hasItem(parameters[0])) {
            System.out.println("You must be seeing visions because there is no such thing as \"" + parameters[0] + "\" in this room");
        } else {
            Item item = context.getCurrent().getItem(parameters[0]);
            item.pickup(context);
        }
    }
}
