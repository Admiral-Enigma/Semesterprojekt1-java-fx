package com.st1.ui.controllers;

import com.st1.Game;
import javafx.event.ActionEvent;

public class PowerPlantOutsideController extends ViewController {
    public void gotoStart(ActionEvent actionEvent) {
        Game.context.transition("start");
    }
}
