package com.st1.interact;

import com.st1.Game;
import com.st1.inventory.items.McChicken;

public class PripyatMan extends BaseNpc {

    public PripyatMan() {
        super("PripyatMan");
    }

    @Override
    public String firstSightingMessage() {
        return "Hej " + getName() + ". Velkommen til Pripyat. \nHar du medbragt en McChicken?";
    }

    @Override
    public String getImagePath() {
        return "Pripyat-man.png";
    }
}