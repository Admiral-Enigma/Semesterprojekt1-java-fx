package com.st1.components;

import com.st1.Context;
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
        Context.inventory.getItems().addListener((MapChangeListener<String, Item>) event -> render());
        render();
    }

    public void render() {
        tilePane.getChildren().clear();
        tilePane.setOrientation(Orientation.HORIZONTAL);

        tilePane.setPrefColumns(Context.inventory.getItemValues().size());
        for (Item item : Context.inventory.getItemValues()) {
            tilePane
                    .getChildren()
                    .add(new ItemSlot(item));
        }
    }

}
