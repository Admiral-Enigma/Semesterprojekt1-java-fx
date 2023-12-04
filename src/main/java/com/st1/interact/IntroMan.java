package com.st1.interact;

import com.st1.Game;

public class IntroMan extends BaseNpc {
    public IntroMan() {
        super("Testman");
    }

    @Override
    public String firstSightingMessage() {
        return """
                Hej (name). Velkommen til Yurigistan,\s

                Vi kan ikke takke dig nok for at have påtaget dig ansvaret som vores konsulent for FN’s bæredygtighedskomité.
                Os her i Yurigistan har truffet en dristig, men hvad vi mener er en nødvendig, beslutning om at efterleve Parisaftalens krav om at udfase kulkraft inden 2030.\s
                
                Vi er derfor i gang med at lukke flere af vores kulkraftværker som står til at blive erstattet af atomkraftværker hurtigst muligt for at sikre en blød overgang.
                Vi har hentet dig ind som konsulent for at overvåge og råde os i ombygningen af (et eller flere) kulkraftværker.
                
                Dine valg de næste par (måneder/år) vil være afgørende for Yurigistan, for at sikre en renere og mere bæredygtig energiproduktion i vores smukke land.
                Kan vi blive et fremgangsland kan vi måske omvende verdens lande og derfor vil dine resultater have langsigtede indvirkninger på vores allesammens planet.\s
                
                Held og lykke med din mission, (name), og lad os sammen arbejde for en grønnere og mere bæredygtig verden.""";
    }

    @Override
    public void normalSightingMessage() {
        Game.textPrinter.printText("Hvad laver du her, kom ud og lav noget");
    }
}
