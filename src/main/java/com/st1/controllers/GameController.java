package com.st1.controllers;

import com.st1.Context;
import com.st1.Game;
import com.st1.components.InventoryComponent;
import com.st1.components.MessagesComponent;
import com.st1.inventory.items.Hakke;
import com.st1.ui.GameScene;
import com.st1.ui.SceneManager;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.SubScene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GameController extends ViewController implements Initializable {
    public TextArea messagesTextArea;
    public VBox currentRoom;

    @FXML
    private TilePane inventoryTilePane;

    private InventoryComponent inventoryComponent;
    private MessagesComponent messagesComponent;

    private SceneManager worldSceneManager;


    @FXML
    protected void onHelloButtonClick() throws IOException {

        GameScene testScene = new GameScene("fxml/test.fxml", getSceneManager());
        currentRoom.getChildren().clear();

        currentRoom.getChildren().add(testScene.getRootElement());
        Context.inventory.add(new Hakke());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.inventoryComponent = new InventoryComponent(inventoryTilePane);
        this.messagesComponent = new MessagesComponent(messagesTextArea);
    }
}