package com.st1.inventory.items;

import com.st1.Game;
import com.st1.core.Context;
import com.st1.inventory.BaseItem;
import com.st1.inventory.UsableItem;

public class Thorium extends BaseItem implements UsableItem {
    public Thorium() {
        super("thorium", "thorium");
    }

    @Override
    public String getPickupMessage() {
        return "Du samler thorium op fra jorden.";
    }

    @Override
    public void pickup(Context context) {
        super.pickup(context);

    }
    @Override
    public String getDescription() {
        return """
                Thorium bruges i reaktoren, hvor det bliver omdannet til Uran-233, for at skabe energi.
                Thorium skal bruges efter reaktorkernen er placeret.
                """;
    }
   @Override
    public void use(Context context) {
       boolean check = (context.getCurrent().getName() == "Boiler Room" && Game.newReactorState.isReactorCorePlaced());
       if (!check) {
            Game.textPrinter.printText("Du kan ikke bruge thoriummet endnu. Mangler der noget, eller er du i det forkerte rum?");
            return;
        }

        this.destroy();
       Game.textPrinter.printText("Du smider thoriummet ind i reaktoren.");
       Game.newReactorState.setReactorFueled(true);
    }

    public String getImagePath() {return "thorium.png";}
}
