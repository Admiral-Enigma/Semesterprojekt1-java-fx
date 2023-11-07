package com.st1.interact;

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
