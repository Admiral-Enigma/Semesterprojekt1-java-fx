package com.st1.interact;

import com.st1.Game;
import com.st1.inventory.items.McFeast;

public class FukushimaMan extends BaseNpc{

        public FukushimaMan() {
            super("FukushimaMan");
        }

        @Override
        public String firstSightingMessage() {
            return "Hej " + getName() + ". Velkommen til Fukushima. \nHar du en McFeast til overs?";
        }

    @Override
    public String getImagePath() {
        return "Fukushimaman.png";
    }
    }

