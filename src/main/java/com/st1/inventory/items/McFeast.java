package com.st1.inventory.items;

import com.st1.Context;
import com.st1.inventory.BaseItem;
import com.st1.inventory.UsableItem;

public class McFeast extends BaseItem implements UsableItem {
    public McFeast() {
        super("mcfeast", "McFeast");
    }

    @Override
    public String getPickupMessage() {
        return "Hvad en McFeast smager af? Jaee McFeast selfølgelig";
    }

    @Override
    public void pickup(Context context) {
        super.pickup(context);

    }

    @Override
    public void use(Context context) {

        System.out.println("*Crunching sound* Nom nom taste very very jummyn");
        this.destroy();
    }

    @Override
    public String getImagePath() {
        return "mcfeast.jpg";
    }
}
