package com.st1.interact;

import com.st1.Game;

public class IntroMan extends BaseNpc {
    public IntroMan() {
        super("Testman");
    }

    @Override
    public String firstSightingMessage() {
        return """
                Velkommen til Yurigistan,
                Vi kan ikke takke dig nok, for at have påtaget dig ansvaret, som vores konsulent for FN’s bæredygtighedskomité.
                Os her i Yurigistan har truffet en dristig, men hvad vi mener er en nødvendig, beslutning om at efterleve Parisaftalens krav om at udfase kulkraft inden 2030.
                Vi er derfor i gang med at lukke flere af vores kulkraftværker, som står til at blive erstattet af atomkraftværker hurtigst muligt, for at sikre en blød overgang. Vi har brug for dig, som konsulent, for at overvåge og råde os i ombygningen af vores kulkraftværker.
                Dine valg i den kommende tid, vil være altafgørende for Yurigistan, for at sikre en renere og mere bæredygtig energiproduktion i vores smukke land.
                Kan vi blive et fremgangsland, så kan vi måske omvende verdens lande, hvilket vil sige at dine resultater kan have langsigtede indvirkninger på vores planet.
                Held og lykke med din mission og lad os sammen arbejde for en grønnere og mere bæredygtig verden.""";
    }

    @Override
    public String getImagePath() {
        return "introman.png";
    }
}
