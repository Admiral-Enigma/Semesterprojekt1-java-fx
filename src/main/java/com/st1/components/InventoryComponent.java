package com.st1.components;

import com.st1.Game;
import com.st1.YurigistanApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.IOException;

public class InventoryComponent extends AnchorPane {

    @FXML
    TilePane tilePane;

    public InventoryComponent() {
        FXMLLoader fxmlLoader = new FXMLLoader(YurigistanApplication.class.getResource("components/inventory-component.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(InventoryComponent.this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        initElements();
    }

    void initElements() {

        tilePane.setPrefRows(10);
        tilePane.setPrefColumns(1);
        tilePane.setTileAlignment(Pos.CENTER);

        for (int i = 0; i < 10; i++) {
            tilePane.getChildren().add(new Rectangle(50, 50, Color.rgb(10 + i *10,10 + i *5,10 + i *2 )));
        }


    }
}
