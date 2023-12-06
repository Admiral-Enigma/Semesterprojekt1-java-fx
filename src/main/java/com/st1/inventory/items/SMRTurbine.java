package com.st1.inventory.items;

import com.st1.core.Context;
import com.st1.Game;
import com.st1.inventory.BaseItem;
import com.st1.inventory.Item;
import com.st1.inventory.PlaceableItem;

public class SMRTurbine extends BaseItem implements Item, PlaceableItem {
    public SMRTurbine() {
        super("turbine", "turbine");
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
    public String getDescription() {
        return """ 
                Turbinen omdanner varme fra reaktoren til strøm, som viderefordeles til en generator.
                Turbinen skal placeres i turbinerummet.
                """;
    }
    @Override
    public void place(Context context) {
        if (context.getCurrent().getName() != "Turbine Room") {
            Game.textPrinter.printText("Du kan ikke placere turbinen her, prøv et andet sted!");
            return;
        }
        this.destroy();
        Game.textPrinter.printText("Turbinen passer perfekt her! Godt arbejde");
        Game.newReactorState.setTurbinePlaced(true);
    }
    @Override
    public String getImagePath() {
        return "turbine.png";
    }
}
