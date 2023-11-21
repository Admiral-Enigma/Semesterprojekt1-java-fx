package com.st1.components;

import com.st1.Game;
import com.st1.inventory.Item;
import com.st1.inventory.PlaceableItem;
import com.st1.inventory.UsableItem;
import com.st1.util.Assets;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class ItemSlot extends Button {
    private Item item;


    public ItemSlot(Item item) {
        this.item = item;
        ImageView imageView = new ImageView(Assets.imageFromPath("assets/" + item.getImagePath()));
        imageView.setFitHeight(64);
        imageView.setFitWidth(64);
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
