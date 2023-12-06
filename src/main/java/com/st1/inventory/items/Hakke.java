package com.st1.inventory.items;

import com.st1.core.Context;
import com.st1.Game;
import com.st1.inventory.BaseItem;
import com.st1.inventory.UsableItem;


public class Hakke extends BaseItem implements UsableItem {
    public Hakke() {
        super("hakke", "hakke");
    }

    @Override
    public String getPickupMessage() {
        return "Wow! Du har fundet en hakke! Gad vide hvad du kan bruge den til";
    }

    @Override
    public String getDescription() {
        return """ 
                Hakken bruges i minen til at skaffe Thorium.
                Tryk på hakken i minen, for at mine.
                """;
    }
    @Override
    public void use(Context context) {

        if (context.getCurrent().getName().equals("Deep in the Mine")){
            Game.textPrinter.printText("Du har fundet thorium!");
            Thorium malt = new Thorium();
            malt.setQuantity(1);
            malt.pickup(Game.context, true);
            this.destroy();

        }
        else{
            Game.textPrinter.printText("Du kan ikke bruge hakken her!");
        }
    }

    @Override
    public String getImagePath() {
        return "pickaxe.png";
    }
}

