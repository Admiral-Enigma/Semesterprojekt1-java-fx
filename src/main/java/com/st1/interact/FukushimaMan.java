package com.st1.interact;

import com.st1.Game;

public class FukushimaMan extends BaseNpc{

        public FukushimaMan() {
            super("FukushimaMan");
        }

        @Override
        public String firstSightingMessage() {
            return "Hej " + getName() + ". Velkommen til Fukushima. \nFukushima ulykken d. 11. marts 2011 som var forårsaget af en kraftig tsunami resulterede i en chokbølge der gik verden over og ændrede manges syn på atomkraft som en pålidelig og sikker energikilde. \nUlykken var et resultat af flere fejl og forsømmelser i dets konstruktion, vedligeholdelse og manglende forberedelse på ulykken. \nPga. Dette blev miljøet og mennesker udsat for atomkraftens mere destruktive sider, men det er ikke alt hvad der er til atomkraft. \nJapan ligger på 4 tektoniske plader, hvilket gør at Japan er konstant udsat for jordskælv.";
        }



    @Override
    public String getImagePath() {
        return "Fukushimaman.png";
    }
    }

