package com.st1.old.st1.interact;

public class MineMan extends BaseNpc {
        public MineMan() {
            super("Mine Abejder");
        }

        @Override
        public void firstSightingMessage() {
            System.out.println("Hej (name). Velkommen til thorium minen. I et atomkraftværk er det er kendt der bruges Thorium som brændstof. \n Der er 3 gange så meget thorium som der er af uran. Der er store naturlige forekomster over det hele på jorden.\n Thorium er et reaktivt metal og derfor bruges det i et atomkraftværk.\n I et atomkraftværk bliver Thorium omdannet til uran, som derefter bruges til at producere elektricitet.\n Det omdannet uran har en halveringstid på 160.000 år, hvilket er langt kortere end thorium, som har en halveringstid på 14 milliarder år.\n Thoriumreaktorer kræver mindre køling end uran hvilket vil nedsænke risikoen for en nedsmeltning.\n Thorium er derudover svært at bruge til atomvåben. ");
        }

        @Override
        public void normalSightingMessage() {
            System.out.println("Hvad laver du her, kom ud og lav noget");
        }
    }

