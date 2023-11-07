package com.st1.inventory;

import com.st1.Context;

public class Thorium extends BaseItem implements UsableItem {
    public Thorium() {
        super("thorium", "Thorium");
    }

    @Override
    public String getPickupMessage() {
        return "Du samler thorium op fra jorden.";
    }

    @Override
    public void pickup(Context context) {
        super.pickup(context);

    }

   @Override

    public void use(Context context) {
        System.out.println("Du smider thoriumet ind i reaktoren.");
        this.destroy();
    }
}
