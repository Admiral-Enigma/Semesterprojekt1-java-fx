package com.st1.ui.controllers;

import com.st1.Game;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class DeeperController extends ViewController {
    public Label title;

    public void gotoSurface(ActionEvent actionEvent) {
        Game.context.transition("mine");

    }
}
