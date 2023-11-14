package com.st1.components;

import com.st1.Context;
import com.st1.Game;
import com.st1.inventory.Item;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.IOException;

public class InventoryComponent extends SimpleComponent {

    @FXML
    private TilePane tilePane;

    @FXML
    private HBox background;

    public InventoryComponent() {
        super("components/inventory-component.fxml");
        render();
    }

    @Override
    public void render() {
        AnchorPane.setLeftAnchor(this, 0.0);
        AnchorPane.setRightAnchor(this, 0.0);
        //background.setBorder(Border.stroke(Color.RED));

        tilePane.setPrefColumns(Context.inventory.getAllItems().size());

        tilePane.setOrientation(Orientation.HORIZONTAL);

        for (Item item : Context.inventory.getAllItems()) {
            tilePane
                    .getChildren()
                    .add(new ItemSlot(item));
        }
    }
}
