package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.core.Direction;
import com.st1.interact.IntroMan;
import com.st1.interact.MineMan;
import com.st1.ui.components.NpcComponent;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;


public class ThoriumMineController extends ViewController implements Initializable {
    public HBox minemmanContainer;
    public void gotoRoad(ActionEvent actionEvent) {
        Game.context.transition(Direction.power_plant_outside);
    }
    public void gotoAirstrip(ActionEvent actionEvent) {
        Game.context.transition(Direction.airstrip);
    }
    public void gotoDeeper(ActionEvent actionEvent) {
        Game.context.transition(Direction.deep_thorium);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        NpcComponent npc  = new NpcComponent(minemmanContainer, new MineMan());

    }
}
