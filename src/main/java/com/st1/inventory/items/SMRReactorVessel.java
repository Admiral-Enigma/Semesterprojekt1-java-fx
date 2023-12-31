package com.st1.inventory.items;

import com.st1.core.Context;
import com.st1.Game;
import com.st1.inventory.BaseItem;
import com.st1.inventory.Item;
import com.st1.inventory.PlaceableItem;

public class SMRReactorVessel extends BaseItem implements Item, PlaceableItem {
    public SMRReactorVessel() {
        super("reactorvessel", "reaktorbeholder");
    }
    //reactor vessel fås i forbindelse med dialog.
    @Override
    public String getPickupMessage() {
        return "Du har fundet reaktorbeholderen! Godt arbejde. \n"
                + "Mange af resourcerne skal ind i beholderen, for at få reaktoren til at virke. \n"
                + "Gad vide, hvor den hører til?";
    }

    @Override
    public void pickup(Context context) {
        super.pickup(context);

    }
    @Override
    public String getDescription() {
        return """ 
                Reaktorbeholderen separerer reaktorkernen fra resten af reaktoren, så den ikke bliver ødelagt.  
                Reaktorbeholderen skal placeres i indeslutningskarret.
                """;
    }

    @Override
    public void place(Context context) {
        boolean check = (context.getCurrent().getName() == "Boiler Room" && Game.newReactorState.isContainmentVesselPlaced());
        if (!check) {
            Game.textPrinter.printText("Du kan ikke placere beholderen her!");
            return;
        }

        this.destroy();
        Game.textPrinter.printText("Reaktorbeholderen passer perfekt ind her. Nu mangler vi kun resten af delene! Godt arbejde");
        Game.newReactorState.setReactorVesselPlaced(true);
    }
    @Override
    public String getImagePath() {
        return "reactor-vessel.png";
    }
}
