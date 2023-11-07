package com.st1.inventory;

import com.st1.Context;

public class McChicken extends BaseItem implements UsableItem {
    public McChicken() {
        super("mcchicken", "McChicken");
    }

    @Override
    public String getPickupMessage() {
        return "Hvad en McChicken smager af? Muggen røv, selvfølgelig";
    }

    @Override
    public void pickup(Context context) {
        super.pickup(context);

    }

    @Override
    public void use(Context context) {

        System.out.println("*Crunching sound* MHHHMMMMM FØJ - FOR - HELVEEEEEDE");
        this.destroy();
    }
}
