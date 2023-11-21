package com.st1.inventory.items;

import com.st1.Context;
import com.st1.Game;
import com.st1.inventory.BaseItem;
import com.st1.inventory.Item;
import com.st1.inventory.PlaceableItem;

public class SMRContainment extends BaseItem implements Item, PlaceableItem {

    public SMRContainment() {
        super("containment", "Containment Vessel for SMR");
    }
        //Containment vessel gives af NPC ved Fukushima, efter dialog/quiz
    @Override
    public String getPickupMessage() {
        return "Du har fundet indeslutningskarret (containment vessel)! \n"
                + "Dette skal sikre, at hele reaktoren er beskyttet ude- og indefra.";
    }

    @Override
    public void pickup(Context context) {
        super.pickup(context);

    }

    @Override
    public void place(Context context) {
        if (context.getCurrent().getName() != "Boiler Room") {
            System.out.println("Indeslutningskarret er det første der skal til, for at du kan bygge resten af reaktoren!");
            return;
        }
        this.destroy();
        System.out.println("Indeslutningskarret er placeret, og er klar til at putte reaktordelene ind i!");
        Game.newReactorState.containmentVesselPlaced = true;
    }
    @Override
    public String getImagePath() {
        return "Containment.png";
    }
}
