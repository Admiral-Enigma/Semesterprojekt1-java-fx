package com.st1.inventory.items;

import com.st1.core.Context;
import com.st1.Game;
import com.st1.inventory.BaseItem;
import com.st1.inventory.Item;
import com.st1.inventory.PlaceableItem;

public class SMRReactorCore extends BaseItem implements Item, PlaceableItem {
    public SMRReactorCore() {
        super("reactorcore", "reaktorkerne");
    }
    //reactor core fås i forbindelse med dialog.
    @Override
    public String getPickupMessage() {
        return "Du har fundet reaktorkernen, husk at være forsigtig med den. \n "
                + "Ville den ikke passe godt ind i reaktorbeholderen?";
    }

    @Override
    public void pickup(Context context) {
        super.pickup(context);

    }
    @Override
    public String getDescription() {
        return """ 
                Reaktorkernen omdanner thorium brændstof til Uran-233, for at skabe energi,
                men med mindre affald end en ren Uran-235 reaktor.
                Reaktorkernen placeres i reaktorrumet, efter reaktorbeholderen.
                """;
    }

    @Override
    public void place(Context context) {
        boolean check = (context.getCurrent().getName() == "Boiler Room" && Game.newReactorState.isReactorVesselPlaced());
        if (!check) {
            Game.textPrinter.printText("Du kan ikke placere reaktorkernen her! Mangler der noget, eller er du i det forkerte rum?");
            return;
        }
        this.destroy();
        Game.textPrinter.printText("Reaktorkernen passede perfekt ind i beholderen, nu sker der noget.");
        Game.newReactorState.setReactorCorePlaced(true);
    }
    @Override
    public String getImagePath() {
        return "reactor-core.png";
    }
}
