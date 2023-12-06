package com.st1.interact;

public class MineMan extends BaseNpc {
        public MineMan() {
            super("Mine Abejder");
        }

        @Override
        public String firstSightingMessage() {
            return "Hej (name). Velkommen til thorium minen. I et atomkraftværk er det er kendt der bruges Thorium som brændstof.\nDer er 3 gange så meget thorium som der er af uran. Der er store naturlige forekomster over det hele på jorden.\nThorium er et reaktivt metal og derfor bruges det i et atomkraftværk.\nI et atomkraftværk bliver Thorium omdannet til uran, som derefter bruges til at producere elektricitet.\nDet omdannet uran har en halveringstid på 160.000 år, hvilket er langt kortere end thorium, som har en halveringstid på 14 milliarder år.\nThoriumreaktorer kræver mindre køling end uran hvilket vil nedsænke risikoen for en nedsmeltning.\nThorium er derudover svært at bruge til atomvåben. ";
        }

    @Override
    public String getImagePath() {
        return "mineman-ryangosling.png";
    }
}