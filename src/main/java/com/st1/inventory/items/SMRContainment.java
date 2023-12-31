package com.st1.inventory.items;

import com.st1.core.Context;
import com.st1.Game;
import com.st1.inventory.BaseItem;
import com.st1.inventory.Item;
import com.st1.inventory.PlaceableItem;

public class SMRContainment extends BaseItem implements Item, PlaceableItem {

    public SMRContainment() {
        super("containment", "indeslutningskarret");
    }
        //Containment vessel gives af NPC ved Fukushima, efter dialog/quiz
    @Override
    public String getPickupMessage() {
        return "Du har fundet indeslutningskarret (containment vessel)! \n"
                + "Dette skal sikre, at hele reaktoren er beskyttet udefra.";
    }
    @Override
    public String getDescription() {
        return """ 
                Indeslutningskarret sikrer at reaktoren er beskyttet ude- og indefra.
                Indeslutningskarret er det første der skal placeres i reaktorrummet.
                """;
    }
    @Override
    public void pickup(Context context) {
        super.pickup(context);

    }

    @Override
    public void place(Context context) {
        boolean check = (context.getCurrent().getName() == "Boiler Room" && Game.newReactorState.isOldPowerPlantRemoved());
        if (!check) {
            Game.textPrinter.printText("Der er ikke plads til indeslutningskarret her!");
            return;
        }
        this.destroy();
        Game.textPrinter.printText("Indeslutningskarret er placeret, og reaktordelene kan nu sættes i!");
        Game.newReactorState.setContainmentVesselPlaced(true);
    }
    @Override
    public String getImagePath() {
        return "containment.png";
    }
}
