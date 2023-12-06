package com.st1.inventory.items;

import com.st1.Game;
import com.st1.core.Context;
import com.st1.inventory.BaseItem;
import com.st1.inventory.UsableItem;

public class Kulkraftværkskedel extends BaseItem {
    public Kulkraftværkskedel() {
        super("Kulkraftværkskedel", "Kulkraftværkskedel");
    }

    @Override
    public String getPickupMessage() {
        return "Efter en mindre kamp, får du fjernet kulkraftværkskedlen.";
    }

    @Override
    public void pickup(Context context) {
        Game.newReactorState.setOldPowerPlantRemoved(true);
        Game.textPrinter.printText(getPickupMessage());
    }

    @Override
    public String getImagePath() {
        return "coal-powerplant.png";
    }

}
