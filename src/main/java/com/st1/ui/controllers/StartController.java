package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.interact.IntroMan;
import com.st1.inventory.items.McFeast;
import com.st1.ui.components.ItemDrop;
import com.st1.core.Direction;
import com.st1.ui.components.NpcComponent;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class StartController extends ViewController implements Initializable {
    public HBox infomanContainer;

    public void gotoPowerplant(ActionEvent actionEvent) {
        Game.context.transition(Direction.power_plant_outside);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        NpcComponent npc  = new NpcComponent(infomanContainer, new IntroMan());

    }
}

