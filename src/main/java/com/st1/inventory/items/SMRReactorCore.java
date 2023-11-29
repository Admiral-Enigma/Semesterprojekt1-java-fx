package com.st1.inventory.items;

import com.st1.core.Context;
import com.st1.Game;
import com.st1.inventory.BaseItem;
import com.st1.inventory.Item;
import com.st1.inventory.PlaceableItem;

public class SMRReactorCore extends BaseItem implements Item, PlaceableItem {
    public SMRReactorCore() {
        super("reactorcore", "Reactor Core for SMR");
    }
    //reactor core fås i forbindelse med dialog.
    @Override
    public String getPickupMessage() {
        return "Du har fundet reaktor-kernen, husk at være forsigtig med den. \n "
                + "Ville den ikke passe godt ind i reaktorbeholderen?";
    }

    @Override
    public void pickup(Context context) {
        super.pickup(context);

    }

    @Override
    public void place(Context context) {
        if (context.getCurrent().getName() != "Boiler Room" && Game.newReactorState.isReactorVesselPlaced()) {
            System.out.println("Du kan ikke placere reaktor-kernen her! Mangler der noget, eller er du i det forkerte rum?");
            return;
        }
        this.destroy();
        System.out.println("Reaktor-kernen passede perfekt ind i beholderen, nu sker der noget.");
        Game.newReactorState.setReactorCorePlaced(true);
    }
    @Override
    public String getImagePath() {
        return "reactor.png";
    }
}
