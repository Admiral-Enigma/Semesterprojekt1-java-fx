package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.inventory.items.Hakke;
import com.st1.inventory.items.McFeast;
import com.st1.ui.components.ItemDrop;
import com.st1.core.Direction;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class StartController extends ViewController implements Initializable {
    public VBox mcfeastItem;
    public VBox hakke;

    public void siuu(ActionEvent actionEvent) {
        Game.context.transition(Direction.power_plant_outside);

        Game.textPrinter.printText("SIUUUUU");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        McFeast mcFeast = new McFeast();
        mcFeast.setQuantity(200);

        Hakke pickaxe = new Hakke();

        new ItemDrop(mcfeastItem, mcFeast);
        new ItemDrop(hakke, pickaxe);
    }
}

