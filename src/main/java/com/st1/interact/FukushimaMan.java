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
        public void normalSightingMessage() {
            if (Game.context.inventory.containsItemOfClass(McFeast.class)) {
                System.out.println("Jamen det er jo en McFeast, er den til mig?");
            } else {
                System.out.println("Har du fundet den der bunke McFeasts?\nNej? den skulle gerne ligge ved start");
            }
        }

    @Override
    public String getImagePath() {
        return "Fukushimaman.png";
    }
    }

