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
                        + "Bevæg dig rundt omkring i verdenen, for at finde de resourcer du skal bruge. \n"
                        + "Du skal bruge disse resourcer: \n"
                        + "Reactor Vessel \n"
                        + "Containment Chamber \n"
                        + "Coolant Circulation \n"
                        + "Steam Generator \n"
                        + "Pressuriser \n"
                        + "Reactor Core \n"
                        + "Containment Chamber \n"
                        + "Turbine \n"
                        + "Thorium ";

    }
    @Override
    public void normalSightingMessage() {
        System.out.println(
                "Bevæg dig rundt omkring i verdenen, for at finde de resourcer du skal bruge. \n"
                + "Du skal bruge disse resourcer: \n"
                + "Reactor Vessel \n"
                + "Containment Chamber \n"
                + "Coolant Circulation \n"
                + "Steam Generator \n"
                + "Pressuriser \n"
                + "Reactor Core \n"
                + "Containment Chamber \n"
                + "Turbine \n"
                + "Thorium ");
    }
    @Override
    public String getImagePath() {
        return "Testinfoman.png";
    }
}
