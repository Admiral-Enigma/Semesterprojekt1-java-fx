package com.st1.components;

import com.st1.Context;
import com.st1.Game;
import com.st1.inventory.Item;
import javafx.collections.MapChangeListener;
import javafx.fxml.FXML;
import javafx.geometry.Orientation;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class InventoryComponent  {

    private TilePane tilePane;

    private HBox background;

    public InventoryComponent(TilePane tilePane) {
        this.tilePane = tilePane;

        // Listen for when the items map changes and rerender inventory UI
        Game.context.inventory.getItems().addListener((MapChangeListener<String, Item>) event -> render());
        render();
    }

    public void render() {
        tilePane.getChildren().clear();
        tilePane.setOrientation(Orientation.HORIZONTAL);

        tilePane.setPrefColumns(Game.context.inventory.getItemValues().size());
        for (Item item : Game.context.inventory.getItemValues()) {
            tilePane
                    .getChildren()
                    .add(new ItemSlot(item));
        }
    }

}
