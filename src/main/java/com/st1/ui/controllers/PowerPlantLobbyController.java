package com.st1.ui.controllers;

import com.st1.Game;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

public class PowerPlantLobbyController extends ViewController {

    public Label title;

    public void goOutside(ActionEvent actionEvent) {
        Game.context.transition("power_plant_outside");
    }

    public void goTurbine(ActionEvent actionEvent) {
        Game.context.transition("power_plant_turbine");
    }

    public void goBoiler(ActionEvent actionEvent) {
        Game.context.transition("power_plant_boiler");
    }

    public void mcFeastify(ActionEvent actionEvent) {
        title.setText("MCFEAST BBBY");
    }
}
