package com.st1.old.st1.interact;

import com.st1.inventory.Inventory;

public class BaseNpc implements Npc {
    private final String name;

    public BaseNpc(String name)  {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void firstSightingMessage() {
    }

    @Override
    public void normalSightingMessage() {

    }

}
