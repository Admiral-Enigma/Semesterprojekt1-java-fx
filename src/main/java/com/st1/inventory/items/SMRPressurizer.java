package com.st1.inventory.items;

import com.st1.Context;
import com.st1.Game;
import com.st1.inventory.BaseItem;
import com.st1.inventory.Item;
import com.st1.inventory.PlaceableItem;

public class SMRPressurizer extends BaseItem implements Item, PlaceableItem {
    public SMRPressurizer() {
        super("pressurizer", "pressurizer for SMR");
    }
    //pressurizer fås i forbindelse med dialog.
    @Override
    public String getPickupMessage() {
        return "Du har fundet en pressurizer. Denne skal sikre at nedkølingsmidlet i reaktoren ikke koger \n"
                + "Den hører til inde i indeslutningskarret (Containment Vessel)";
    }

    @Override
    public void pickup(Context context) {
        super.pickup(context);

    }

    @Override
    public void place(Context context) {
        if (context.getCurrent().getName() != "Boiler Room" && Game.newReactorState.containmentVesselPlaced != true) {
            System.out.println("Du kan ikke placere pressurizeren her! Mangler der noget, eller er du i det forkerte rum?");
            return;
        }
        this.destroy();
        System.out.println("Reaktor-kernen passede perfekt ind i beholderen, nu sker der noget.");
        Game.newReactorState.pressurizerPlaced = true;
    }
    @Override
    public String getImagePath() {
        return "Pressurizer.png";
    }
}
