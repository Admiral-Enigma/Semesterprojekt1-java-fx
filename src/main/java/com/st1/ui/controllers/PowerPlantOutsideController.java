package com.st1.ui.controllers;

import com.st1.Game;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

public class PowerPlantOutsideController extends ViewController {

    public Label title;

    public void gotoStart(ActionEvent actionEvent) {
        Game.context.transition("start");
    }
    public void gotoMine(ActionEvent actionEvent) {
        Game.context.transition("mine");
    }

    public void mcFeastify(ActionEvent actionEvent) {
        title.setText("MCFEAST BBBY");
    }
}
