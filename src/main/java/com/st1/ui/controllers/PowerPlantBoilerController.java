package com.st1.ui.controllers;

import com.st1.Game;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class PowerPlantBoilerController {
    public Label title;

    public void goLobby(ActionEvent actionEvent) {
        Game.context.transition("power_plant_lobby");
    }

}
    /*
    public void buildReactor(ActionEvent actionEvent) {

        **INDSÆT FUNKTIONER TIL AT BYGGE TURBINE HER**
        }
     */