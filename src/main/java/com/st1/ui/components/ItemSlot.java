package com.st1.ui.components;

import com.st1.Game;
import com.st1.inventory.Item;
import com.st1.inventory.PlaceableItem;
import com.st1.inventory.UsableItem;
import com.st1.util.Assets;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class ItemSlot extends Button {
    private Item item;


    public ItemSlot(Item item) {
        this.item = item;
        ImageView imageView = new ImageView(Assets.imageFromPath("assets/" + item.getImagePath()));
        imageView.setFitHeight(48);
        imageView.setFitWidth(48);
        this.setStyle("-fx-background-color: #e5e7eb;");
        this.setGraphic(imageView);
        this.setOnMouseClicked(MouseEvent -> {
            if (item instanceof UsableItem) {
                ((UsableItem) item).use(Game.context);
            } else if (item instanceof PlaceableItem) {
                ((PlaceableItem) item).place(Game.context);
            }
        });
    }

}
