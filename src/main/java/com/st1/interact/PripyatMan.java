package com.st1.interact;

import com.st1.Game;

public class PripyatMan extends BaseNpc {

    public PripyatMan() {
        super("PripyatMan");
    }

    @Override
    public String firstSightingMessage() {
        return "Hej " + getName() + ". Velkommen til Pripyat. \nHar du medbragt en McChicken?";
    }

    @Override
    public void normalSightingMessage() {
        if (Game.context.inventory.containsItemOfClass(McChicken.class)) {
            System.out.println("Jamen det er jo en McChicken... ad");
        } else {
            System.out.println("Har du fundet en McChicken?\nNej? Jamen godt for dig");
        }
    }

    @Override
    public String getImagePath() {
        return "Pripyat-man.png";
    }
}