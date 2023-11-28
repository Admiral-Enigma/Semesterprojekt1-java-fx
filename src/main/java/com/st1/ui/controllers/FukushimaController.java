package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.core.Direction;
import javafx.event.ActionEvent;

public class FukushimaController extends ViewController {
    public void gotoAirstrip(ActionEvent actionEvent) {
        Game.context.transition(Direction.airstrip);
    }

}
