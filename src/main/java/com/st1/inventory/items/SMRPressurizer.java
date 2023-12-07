package com.st1.inventory.items;

import com.st1.core.Context;
import com.st1.Game;
import com.st1.inventory.BaseItem;
import com.st1.inventory.Item;
import com.st1.inventory.PlaceableItem;

public class SMRPressurizer extends BaseItem implements Item, PlaceableItem {
    public SMRPressurizer() {
        super("pressurizer", "ekspansionsbeholder");
    }
    //pressurizer fås i forbindelse med dialog.
    @Override
    public String getPickupMessage() {
        return "Du har fundet en ekspansionsbeholder. Denne skal sikre at nedkølingsmidlet i reaktoren ikke koger \n"
                + "Den hører til inde i indeslutningskarret.";
    }

    @Override
    public void pickup(Context context) {
        super.pickup(context);

    }
    @Override
    public String getDescription() {
        return """ 
                Ekspansionsbeholderen sørger for der er det rette tryk i reaktoren, 
                så der ikke behøves for høje temperaturer for at generere strøm.
                Ekspansionsbeholderen skal placeres i reaktorrummet.
                """;
    }

    @Override
    public void place(Context context) {
        boolean check = (context.getCurrent().getName() == "Boiler Room" && Game.newReactorState.isContainmentVesselPlaced());
        if (!check) {
            Game.textPrinter.printText("Du kan ikke placere ekspansionsbeholderen her! Mangler der noget, eller er du i det forkerte rum?");
            return;
        }
        this.destroy();
        Game.textPrinter.printText("Ekspansionsbeholder passede perfekt i reaktorrummet!");
        Game.newReactorState.setPressurizerPlaced(true);
    }
    @Override
    public String getImagePath() {
        return "pressurizer.png";
    }
}
