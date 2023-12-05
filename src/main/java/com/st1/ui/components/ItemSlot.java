package com.st1.ui.components;

import com.st1.Game;
import com.st1.core.GameState;
import com.st1.inventory.Item;
import com.st1.inventory.PlaceableItem;
import com.st1.inventory.UsableItem;
import com.st1.util.Assets;
import javafx.geometry.Bounds;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;

public class ItemSlot extends Button {
    private Item item;
    public ItemSlot(Item item) {
        this.item = item;
        ImageView imageView = new ImageView(Assets.imageFromPath("assets/" + item.getImagePath()));
        imageView.setFitHeight(64);
        imageView.setFitWidth(64);
        this.getStyleClass().add("itemslot");
        this.setTooltip(new Tooltip(item.getDescription()));

        // https://stackoverflow.com/questions/24621133/javafx-how-to-set-tooltip-location-relative-to-the-mouse-cursor
        this.getTooltip().setOnShowing(s->{
            //Get button current bounds on computer screen
            Bounds bounds = this.localToScreen(this.getBoundsInLocal());
            this.getTooltip().setX(bounds.getMaxX());
            this.getTooltip().setY(bounds.getMinY());

        });
        this.setGraphic(imageView);
        this.setOnMouseClicked(MouseEvent -> {
            if (item instanceof UsableItem) {
                ((UsableItem) item).use(Game.context);
            } else if (item instanceof PlaceableItem) {
                ((PlaceableItem) item).place(Game.context);
                // Tjek om spilleren har bygget reaktoren som det endelige
                if (Game.newReactorState.completelyBuilt()) {
                    Game.state = GameState.DONE;
                }
            }
        });
    }

}
