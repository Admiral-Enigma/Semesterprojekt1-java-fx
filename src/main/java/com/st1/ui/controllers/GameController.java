package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.ui.components.InventoryComponent;
import com.st1.ui.components.MessagesComponent;
import com.st1.inventory.items.Hakke;
import com.st1.ui.GameScene;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

public class GameController extends ViewController implements Initializable {
    public TextArea messagesTextArea;
    public VBox currentRoom;

    @FXML
    private TilePane inventoryTilePane;

    private InventoryComponent inventoryComponent;
    private MessagesComponent messagesComponent;
    private Map<String, GameScene> spaces;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        renderCurrentSpace();

        this.inventoryComponent = new InventoryComponent(inventoryTilePane);
        this.messagesComponent = new MessagesComponent(messagesTextArea);
        Game.context.addListener(observable -> renderCurrentSpace());
    }

    private void renderCurrentSpace() {
        currentRoom.getChildren().clear();
        currentRoom.getChildren().add(Game.context.getCurrent().getGameScene().getRootElement());
    }




}