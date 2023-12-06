package com.st1.inventory.items;

import com.st1.core.Context;
import com.st1.Game;
import com.st1.inventory.BaseItem;
import com.st1.inventory.Item;
import com.st1.inventory.PlaceableItem;

public class SMRCoolantCirculation extends BaseItem implements Item, PlaceableItem {
    public SMRCoolantCirculation() {
        super("coolant", "Coolant Circulation for SMR");
    }
    //Coolant Circulation fås i forbindelse med dialog.
    @Override
    public String getPickupMessage() {
        return "Du har fundet nedkølingsvæsken til reaktoren.\n "
                + "Den skal nedkøle reaktoren, så den producerer den rigtige mængde energi, uden at overophede, hele tiden.";
    }

    @Override
    public void pickup(Context context) {
        super.pickup(context);

    }

    @Override
    public void place(Context context) {
        if (context.getCurrent().getName() != "Boiler Room" && Game.newReactorState.isReactorVesselPlaced()) {
            Game.textPrinter.printText("Nedkølingsvæsken passer ikke her. Mangler der noget, eller er du i det rigtige rum?");
            return;
        }

        this.destroy();
        Game.textPrinter.printText("Her kan Nedkølingsvæsken virkelig bruges! Godt arbejde!");
        Game.newReactorState.setCoolantCirculationPlaced(true);

    }
    @Override
    public String getImagePath() {
        return "coolant.png";
    }
}
