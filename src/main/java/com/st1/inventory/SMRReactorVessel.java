package com.st1.inventory;

import com.st1.Context;
import com.st1.Game;

public class SMRReactorVessel extends BaseItem implements Item, PlaceableItem{
    public SMRReactorVessel() {
        super("reactorvessel", "Reactor Vessel for SMR");
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
    public void place(Context context) {
        if (context.getCurrent().getName() != "Boiler Room" && Game.newReactorState.containmentVesselPlaced != true) {
            System.out.println("Du kan ikke placere beholderen her!");
            return;
        }

        this.destroy();
        System.out.println("Reaktorbeholderen passer perfekt ind her. Nu mangler vi kun resten af delene! Godt arbejde");
        Game.newReactorState.reactorVesselPlaced = true;
    }
}
