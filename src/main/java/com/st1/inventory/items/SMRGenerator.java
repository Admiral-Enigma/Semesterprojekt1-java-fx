package com.st1.inventory.items;

import com.st1.core.Context;
import com.st1.Game;
import com.st1.inventory.BaseItem;
import com.st1.inventory.Item;
import com.st1.inventory.PlaceableItem;

public class SMRGenerator extends BaseItem implements Item, PlaceableItem {
    public SMRGenerator() {
        super("generator", "generator");
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
    public String getDescription() {
        return """ 
                Generatoren fordeler strøm fra reaktoren og ud til elnetværket.
                Generatoren skal placeres i turbinerummet.
                """;
    }
    @Override
    public void place(Context context) {
        if (context.getCurrent().getName() != "Turbine Room") {
            Game.textPrinter.printText("Du kan ikke placere generatoren her!");
            return;
        }

        this.destroy();
        Game.textPrinter.printText("Generatoren passer perfekt, godt arbejde!");
        Game.newReactorState.setGeneratorPlaced(true);
    }
    @Override
    public String getImagePath() {
        return "generator.png";
    }
}

