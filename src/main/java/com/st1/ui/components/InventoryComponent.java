package com.st1.ui.components;

import com.st1.Game;
import com.st1.inventory.Item;
import javafx.collections.MapChangeListener;
import javafx.geometry.Orientation;
import javafx.scene.layout.*;

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
