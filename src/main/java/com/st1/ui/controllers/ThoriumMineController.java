package com.st1.ui.controllers;

import com.st1.Game;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class ThoriumMineController extends ViewController {

    public void gotoRoad(ActionEvent actionEvent) {
        Game.context.transition("power_plant_outside");
    }
    public void gotoAirstrip(ActionEvent actionEvent) {
        Game.context.transition("airstrip");
    }
    public void gotoDeeper(ActionEvent actionEvent) {
        Game.context.transition("deeper");
    }

}
