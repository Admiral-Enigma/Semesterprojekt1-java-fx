package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.core.Direction;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class DeeperController extends ViewController {
    public Label title;

    public void gotoSurface(ActionEvent actionEvent) {
        Game.context.transition(Direction.thorium_mine);

    }
}
