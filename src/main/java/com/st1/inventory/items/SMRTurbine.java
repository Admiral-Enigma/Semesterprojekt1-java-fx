package com.st1.inventory.items;

import com.st1.Context;
import com.st1.Game;
import com.st1.inventory.BaseItem;
import com.st1.inventory.Item;
import com.st1.inventory.PlaceableItem;

public class SMRTurbine extends BaseItem implements Item, PlaceableItem {
    public SMRTurbine() {
        super("turbine", "Turbine");
    }
    //Turbine gives af NPC ved Pripyat, efter dialog/quiz
    @Override
    public String getPickupMessage() {
        return "Du har fundet en turbine. Den tager varmen fra reaktoren og laver det om til strøm til en generator. Gad vide, hvor den hører til?";
    }

    @Override
    public void pickup(Context context) {
        super.pickup(context);

    }

    @Override
    public void place(Context context) {
        if (context.getCurrent().getName() != "Turbine Room") {
            System.out.println("Du kan ikke placere turbinen her, prøv et andet sted!");
            return;
        }
        this.destroy();
        System.out.println("Turbinen passer perfekt her! Godt arbejde");
        Game.newReactorState.turbinePlaced = true;
    }
}
