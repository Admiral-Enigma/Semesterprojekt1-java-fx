package com.st1.old.st1.inventory;

import com.st1.Context;

public class Kulkraftværkskedel extends BaseItem implements UsableItem {
    public Kulkraftværkskedel() {
        super("Kulkraftværkskedel", "Kulkraftværkskedel");
    }

    @Override
    public String getPickupMessage() {
        return "Efter en mindre kamp, får du fjernet kulkraftværkskedlen.";
    }

    @Override
    public void pickup(Context context) {
        super.pickup(context);

    }

    @Override
    public void use(Context context) {

        System.out.println("Væk med den.");
        this.destroy();
    }
}
