package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.core.Direction;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class ThoriumMineController extends ViewController {

    public void gotoRoad(ActionEvent actionEvent) {
        Game.context.transition(Direction.power_plant_outside);
    }
    public void gotoAirstrip(ActionEvent actionEvent) {
        Game.context.transition(Direction.airstrip);
    }
    public void gotoDeeper(ActionEvent actionEvent) {
        Game.context.transition(Direction.deep_thorium);
    }

}
