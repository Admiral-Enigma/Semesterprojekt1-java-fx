package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.core.GameState;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class PowerPlantTurbineController extends ViewController {
    public Label title;

    public void goLobby(ActionEvent actionEvent) {
        Game.context.transition("power_plant_lobby");
    }

}


    /*
    public void buildTurbine(ActionEvent actionEvent) {

        **INDSÆT FUNKTIONER TIL AT BYGGE TURBINE HER**
        }
     */