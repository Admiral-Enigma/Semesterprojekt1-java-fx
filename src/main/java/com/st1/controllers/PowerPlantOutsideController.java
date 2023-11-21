package com.st1.controllers;

import com.st1.Context;
import com.st1.Game;
import javafx.event.ActionEvent;

public class PowerPlantOutsideController extends ViewController {
    public void gotoStart(ActionEvent actionEvent) {
        Game.context.transition("start");
    }
}
