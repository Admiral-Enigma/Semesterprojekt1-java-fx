package com.st1.inventory;

import com.st1.core.Context;
import com.st1.Game;

public class BaseItem implements Item {
   private final String name;
   private final String id;
   private Integer quantity;

    public BaseItem(String id, String name) {
       this.name = name;
       this.id = id;
       this.quantity = 1;
    }

    public void pickup(Context context) {
        this.pickup(context, false);
    }

    public void pickup(Context context, boolean silent) {
        Game.textPrinter.printText("* Player picked up " + this.getQuantity() + " "+ this.getName() + " *");
        Game.context.inventory.add(this);
        if (!silent) {
            Game.textPrinter.printText(this.getPickupMessage());
        }
    }

    @Override
    public void destroy() {
        Game.context.inventory.destroy(this);
    }

    @Override
    public void setQuantity(Integer newQuantity) {
        this.quantity = newQuantity;
    }

    public String getDescription() {
       return this.name + " has no description";
    }

    @Override
    public String getPickupMessage() {
        return null;
    }

    @Override
    public Integer getQuantity() {
        return this.quantity;
    }

    @Override
    public String getImagePath() {
        return "notfound.png";
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

}
