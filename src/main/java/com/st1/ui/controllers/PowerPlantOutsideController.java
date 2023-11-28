package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.core.Direction;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

public class PowerPlantOutsideController extends ViewController {

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

    public void mcFeastify(ActionEvent actionEvent) {
        title.setText("MCFEAST BBBY");
    }


}
