package com.st1.ui.controllers;


import com.st1.Game;
import com.st1.inventory.items.Thorium;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import com.st1.ui.components.ItemDrop;
import java.util.ResourceBundle;


public class DeeperController extends ViewController {
    public Label title;
    public void gotoSurface(ActionEvent actionEvent) {
        Game.context.transition("surface");
    }
    public void initialize (URL url, ResourceBundle resourceBundle) {
        Thorium thorium = new Thorium();
        new ItemDrop(thoriumItem, Thorium);
    }
}
