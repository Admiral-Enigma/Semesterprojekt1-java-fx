package com.st1.commands;

import com.st1.Context;
import com.st1.inventory.Item;
import com.st1.inventory.UsableItem;

public class CommandUse extends BaseCommand implements Command {
    public CommandUse(){description = "Brug et item";}
    @Override
    public void execute(Context context, String command, String[] parameters) {

        if (guardEq(parameters, 1)) {
            System.out.println("Hvilket item er det du prøver at bruge?");
            return;
        }

        try {
            Item item = Context.inventory.getItem(parameters[0]);
            if(item instanceof UsableItem){
                ((UsableItem) item).use(context);
            } else {
                System.out.println("Dette item er ikke i dit varehus");
            }

        } catch (Exception e) {
            System.out.println("Det her item findes ikke");
        }


    }
}