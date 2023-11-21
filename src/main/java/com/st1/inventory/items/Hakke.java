package com.st1.inventory.items;

import com.st1.core.Context;
import com.st1.Game;
import com.st1.inventory.BaseItem;
import com.st1.inventory.UsableItem;


public class Hakke extends BaseItem implements UsableItem {
    public Hakke() {
        super("hakke", "Hakke");
    }

    @Override
    public String getPickupMessage() {
        return "Wow! Du har fundet en hakke! Gad vide hvad du kan bruge den til";
    }


    @Override
    public void use(Context context) {

        if (context.getCurrent().getName().equals("Deep in the Mine")){
            System.out.println("*Hak, hak* Du har fundet thorium! Husk at samle det op!");
            Thorium malt = new Thorium();
            malt.setQuantity(2);
            malt.pickup(Game.context, true);
            this.destroy();

        }
        else{
            Game.textPrinter.printText("Hvad fanden er det du laver?! Du kan sgu da ikke bruge en hakke her!");
        }
    }
}

