package com.st1.ui.components;

import com.st1.Game;
import com.st1.inventory.Item;
import com.st1.util.Assets;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class ItemDrop {
    private final Item item;

    public ItemDrop(VBox parent, Item item) {
        this.item = item;
        Button button = new Button();

        ImageView imageView = new ImageView(Assets.imageFromPath("assets/" + item.getImagePath()));
        imageView.setFitHeight(parent.getPrefHeight());
        imageView.setFitWidth(parent.getPrefWidth());
        button.setStyle("-fx-background-color: transperant;");
        button.setGraphic(imageView);
        button.setOnMouseClicked(MouseEvent -> {
            this.item.pickup(Game.context);
            parent.getChildren().remove(button);
        });

        parent.getChildren().add(button);
    }

}
