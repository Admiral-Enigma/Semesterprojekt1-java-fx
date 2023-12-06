package com.st1.interact;

public class OutsideInfoMan extends BaseNpc {

    public OutsideInfoMan() {
        super("Info man");
    }
    @Override
    public String firstSightingMessage() {
        return
                "Hej (name). Jeg må igen, undertrykke vores taknemmelighed for at du vil hjælpe os,  \n"
                        + "Vi i Yurigistan har en gammel nedlagt kulkraftsreaktor.\n"
                        + "Hvis du forsætter mod lobby, vil du finde to rum. \n"
                        + "I de rum kan du placere de resourcer vi skal bruge for at omdanne reaktoren til en Small Modular Reactor. \n"
                        + "Denne reaktor vil give nogenlunde samme energi til nærområdet, hvilket sikrer at vi ikke bruger for meget eller for lidt energi. \n"
                        + "Reaktoren vil generere omkring 300 Megawatt, men producere strøm hele tiden. I modsætning til kul, som har en gennemsnitlig oppetid på 50% \n"
                        + "Men som måske genererer 600 Megawatt. Dette gør reaktoren meget mere bæredygtig."
                        + "Bevæg dig rundt omkring i verdenen, for at finde de resourcer du skal bruge. \n"
                        + "Du kan gå ind i kraftværkets reaktorrum, for at se hvilke resourcer, du skal bruge:";

    }

    @Override
    public String getImagePath() {
        return "Testinfoman.png";
    }
}
