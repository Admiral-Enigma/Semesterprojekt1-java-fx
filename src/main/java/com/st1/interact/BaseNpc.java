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
    public String firstSightingMessage() {
        return "Jeg ved ikke hvad jeg skal sige";
    }

    @Override
    public void normalSightingMessage() {
    }
    @Override
    public String getImagePath() {
        return "notfound.png";
    }


}
