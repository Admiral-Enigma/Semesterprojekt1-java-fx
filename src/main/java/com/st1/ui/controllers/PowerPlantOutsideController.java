package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.core.Direction;
import com.st1.interact.OutsideInfoMan;
import com.st1.ui.components.NpcComponent;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;


import java.net.URL;
import java.util.ResourceBundle;

public class PowerPlantOutsideController extends ViewController implements Initializable {

    public HBox powerPlantOutsideManContainer;
    public Label title;

    public void gotoStart(ActionEvent actionEvent) {
        Game.context.transition(Direction.start);
    }
    public void gotoMine(ActionEvent actionEvent) {
        Game.context.transition(Direction.thorium_mine);
    }
    public void goLobby(ActionEvent actionEvent) {
        Game.context.transition(Direction.power_plant_lobby);
    }
    public void gotoAirstrip(ActionEvent actionEvent) {Game.context.transition(Direction.airstrip);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        NpcComponent npc = new NpcComponent(powerPlantOutsideManContainer, new OutsideInfoMan());
    }
}