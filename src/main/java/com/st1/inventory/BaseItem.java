package com.st1.inventory;

import com.st1.Context;

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
        System.out.println("* Player picked up " + this.getQuantity() + " "+ this.getName() + " *");
        Context.inventory.add(this);
        if (!silent) {
            System.out.println(this.getPickupMessage());
        }
    }

    @Override
    public void destroy() {
        Context.inventory.destroy(this);
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



    public String getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

}
