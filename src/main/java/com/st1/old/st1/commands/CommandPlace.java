package com.st1.old.st1.commands;

import com.st1.Context;
import com.st1.Game;
import com.st1.GameState;
import com.st1.inventory.Item;
import com.st1.inventory.PlaceableItem;
import com.st1.inventory.UsableItem;

public class CommandPlace extends BaseCommand implements Command {
    public CommandPlace(){description = "Placer et item";}
    @Override
    public void execute(Context context, String command, String[] parameters) {

        if (guardEq(parameters, 1)) {
            System.out.println("Hvilket item er det du prøver at placere?");
            return;
        }

        try {
            Item item = Context.inventory.getItem(parameters[0]);
            if(item instanceof PlaceableItem){
                ((PlaceableItem) item).place(context);

                if (Game.newReactorState.completelyBuilt()) {
                    // Spilleren har bygget den nye reaktor og spillet er done
                    Game.state = GameState.DONE;
                }
            } else {
                System.out.println("Dette item kan ikke placeres");
            }

        } catch (Exception e) {
            System.out.println("Det her item findes ikke");
        }


    }
}