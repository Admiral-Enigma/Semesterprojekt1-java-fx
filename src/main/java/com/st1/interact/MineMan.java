package com.st1.interact;

public class MineMan extends BaseNpc {
        public MineMan() {
            super("Mine Abejder");
        }

        @Override
        public String firstSightingMessage() {
            return "Hej (name). Velkommen til thorium minen. I et atomkraftværk kan der bruges både thorium og uran som brændstof." +
                    "\nDer er 3 gange så meget thorium som der er uran, hvilket kan findes i store naturlige forekomster over hele jorden." +
                    "\nThorium er et reaktivt metal, som gør det brugbart i et atomkraftværk." +
                    "\nI et atomkraftværk bliver thorium omdannet til en speciel form for uran, som derefter bruges til at producere elektricitet." +
                    "\nDet omdannede uran har en halveringstid på 160.000 år, hvilket er langt kortere end thorium, som har en halveringstid på 14 milliarder år." +
                    "\nThoriumreaktorer kræver mindre køling end en ren uranreaktor, hvilket stærkt vil nedsænke risikoen for en nedsmeltning." +
                    "\nThorium er derudover svært at bruge til atomvåben. ";
        }

    @Override
    public String getImagePath() {
        return "mineman-ryangosling.png";
    }
}