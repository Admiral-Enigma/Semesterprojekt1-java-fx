package com.st1.components;

import com.st1.Context;
import com.st1.inventory.Item;
import javafx.collections.MapChangeListener;
import javafx.fxml.FXML;
import javafx.geometry.Orientation;
import javafx.scene.layout.*;

public class InventoryComponent extends SimpleComponent {

    @FXML
    private TilePane tilePane;

    @FXML
    private HBox background;

    public InventoryComponent() {
        super("components/inventory-component.fxml");


        // Listen for when the items map changes and rerender inventory UI
        Context.inventory.getItems().addListener((MapChangeListener<String, Item>) event ->  {
            onInventoryChanged((MapChangeListener.Change<String, Item>) event);
        });

    }

    public void onInventoryChanged(MapChangeListener.Change<String, Item> event) {
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
