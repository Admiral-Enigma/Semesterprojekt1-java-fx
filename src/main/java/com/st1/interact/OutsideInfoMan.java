package com.st1.interact;

public class OutsideInfoMan extends BaseNpc {

    public OutsideInfoMan() {
        super("Info man");
    }
    @Override
    public String firstSightingMessage() {
        return
                "Hej! Os i Yurigistan kan ikke takke dig nok for at du vil hjælpe os,  \n"
                        + "Vi i Yurigistan har en gammel nedlagt kulkraftsreaktor.\n"
                        + "Hvis du forsætter mod lobbyen, så vil du finde to rum. \n"
                        + "I de rum kan du placere de ressourcer vi skal bruge for at omdanne reaktoren til en atomreaktor, også kendt som small modular reactor. \n"
                        + "Reaktoren vil generere omkring 300 Megawatt, men producere strøm hele tiden. I modsætning til kulkraftsreaktor, som har en gennemsnitlig oppetid på 50% \n"
                        + "Men som måske genererer 600 Megawatt. Dette gør reaktoren meget mere bæredygtig."
                        + "Bevæg dig rundt omkring i verdenen, for at finde de ressourcer, som du skal bruge. \n"
                        + "Du kan gå ind i kraftværkets reaktorrum, for at se hvilke ressourcer, du skal bruge.";

    }

    @Override
    public String getImagePath() {
        return "Testinfoman.png";
    }
}
