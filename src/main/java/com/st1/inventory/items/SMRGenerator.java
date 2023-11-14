package com.st1.inventory.items;

import com.st1.Context;
import com.st1.Game;
import com.st1.inventory.BaseItem;
import com.st1.inventory.Item;
import com.st1.inventory.PlaceableItem;

public class SMRGenerator extends BaseItem implements Item, PlaceableItem {
    public SMRGenerator() {
        super("generator", "Generator");
    }
    //Generator findes på jorden ved lobbyen i Yurigistan
    @Override
    public String getPickupMessage() {
        return "Du har fundet en generator! Den sender strøm både ind til reaktoren, og ud til elnetværket. Gad vide, hvor den hører til?";
    }

    @Override
    public void pickup(Context context) {
        super.pickup(context);

    }


    @Override
    public void place(Context context) {
        if (context.getCurrent().getName() != "Turbine Room") {
            System.out.println("Du kan ikke placere generatoren her!");
            return;
        }

        this.destroy();
        System.out.println("Generatoren passer perfekt her, godt arbejde!");
        Game.newReactorState.generatorPlaced = true;
    }
}
