package com.st1.interact;

import com.st1.Game;

public class FukushimaMan extends BaseNpc{

        public FukushimaMan() {
            super("FukushimaMan");
        }

        @Override
        public String firstSightingMessage() {
            return "Hej! Velkommen til Fukushima." +
                    "\nFukushima ulykken d. 11. marts 2011, som var forårsaget af en kraftig tsunami " +
                    "\nresulterede i en chokbølge der gik verden over " +
                    "\nog ændrede manges syn på atomkraft, som en pålidelig og sikker energikilde. " +
                    "\nUlykken var et resultat af flere fejl og forsømmelser i dets konstruktion, " +
                    "\nvedligeholdelse og manglende forberedelse på ulykken. " +
                    "\nPga. dette blev miljøet og mennesker udsat for atomkraftens destruktive side, " +
                    "\nmen det er ikke alt, hvad der er til atomkraft. " +
                    "\nUdover at Japan blev ramt af en kraftig tsunami" +
                    "\nså ligger Japen på 4 tektoniske plader, der gør at det er konstant udsat for jordskælv," +
                    "\nhvilket gør det besværligere at bygge atomkræftværker der.";
        }



    @Override
    public String getImagePath() {
        return "Fukushimaman.png";
    }
    }

