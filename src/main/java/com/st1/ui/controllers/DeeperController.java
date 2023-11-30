package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.inventory.items.Hakke;
import com.st1.ui.components.ItemDrop;
import com.st1.core.Direction;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class DeeperController extends ViewController implements Initializable {
    public VBox hakke;


    public void gotoSurface(ActionEvent actionEvent) {
        Game.context.transition(Direction.thorium_mine);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Hakke pickaxe = new Hakke();

        new ItemDrop(hakke, pickaxe);
    }
}
