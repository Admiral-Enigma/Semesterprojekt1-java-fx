package com.st1.ui.components;

import com.st1.Game;
import com.st1.inventory.Item;
import javafx.collections.MapChangeListener;
import javafx.geometry.Orientation;
import javafx.scene.layout.*;

public class InventoryComponent  {

    private HBox root;

    public InventoryComponent(HBox root) {
        this.root = root;

        // Listen for when the items map changes and rerender inventory UI
        Game.context.inventory.getItems().addListener((MapChangeListener<String, Item>) event -> render());
        render();
    }

    public void render() {
        root.getChildren().clear();

        for (Item item : Game.context.inventory.getItemValues()) {
            root
                    .getChildren()
                    .add(new ItemSlot(item));
        }
    }

}
