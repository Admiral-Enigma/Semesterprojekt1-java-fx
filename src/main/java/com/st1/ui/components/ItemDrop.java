package com.st1.ui.components;

import com.st1.Game;
import com.st1.inventory.Item;
import com.st1.util.Assets;
import javafx.geometry.Bounds;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
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
        imageView.setPreserveRatio(true);
        button.setStyle("-fx-background-color: transparent;");
        button.setGraphic(imageView);
        button.setOnMouseClicked(MouseEvent -> {
            this.item.pickup(Game.context);
            parent.getChildren().remove(button);
        });

        // Only show the name here
        button.setTooltip(new Tooltip(item.getName()));

        // https://stackoverflow.com/questions/24621133/javafx-how-to-set-tooltip-location-relative-to-the-mouse-cursor
        button.getTooltip().setOnShowing(s->{
            //Get button current bounds on computer screen
            Bounds bounds = button.localToScreen(button.getBoundsInLocal());
            button.getTooltip().setX(bounds.getMaxX());
            button.getTooltip().setY(bounds.getMinY());

        });

        parent.getChildren().add(button);
    }

}
