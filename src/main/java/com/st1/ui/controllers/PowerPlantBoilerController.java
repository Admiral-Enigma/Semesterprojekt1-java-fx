package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.core.Direction;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class PowerPlantBoilerController extends ViewController {
    public Label title;

    public void goLobby(ActionEvent actionEvent) {
        Game.context.transition(Direction.power_plant_lobby);
    }

}
    /*
    public void buildReactor(ActionEvent actionEvent) {

        **INDSÆT FUNKTIONER TIL AT BYGGE TURBINE HER**
        }
     */