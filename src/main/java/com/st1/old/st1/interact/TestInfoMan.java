package com.st1.old.st1.interact;

public class TestInfoMan extends BaseNpc {
    public TestInfoMan() {
        super("Testman");
    }

    @Override
    public void firstSightingMessage() {
        System.out.println("Hej (name). Velkommen til Yurigistan,  \n" +
                "Vi kan ikke takke dig nok for at have påtaget dig ansvaret som vores konsulent for FN’s bæredygtighedskomité.\nOs her i Yurigistan har truffet en dristig, men hvad vi mener er en nødvendig, beslutning om at efterleve Parisaftalens krav om at udfase kulkraft inden 2030. \nVi er derfor i gang med at lukke flere af vores kulkraftværker som står til at blive erstattet af atomkraftværker hurtigst muligt for at sikre en blød overgang.\nVi har hentet dig ind som konsulent for at overvåge og råde os i ombygningen af (et eller flere) kulkraftværker.\nDine valg de næste par (måneder/år) vil være afgørende for Yurigistan, for at sikre en renere og mere bæredygtig energiproduktion i vores smukke land.\nKan vi blive et fremgangsland kan vi måske omvende verdens lande og derfor vil dine resultater have langsigtede indvirkninger på vores allesammens planet. \n" +
                "Held og lykke med din mission, (name), og lad os sammen arbejde for en grønnere og mere bæredygtig verden.");
    }

    @Override
    public void normalSightingMessage() {
        System.out.println("Hvad laver du her, kom ud og lav noget");
    }
}
