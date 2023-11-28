package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.core.Direction;
import javafx.event.ActionEvent;

public class StartController extends ViewController {
    public void siuu(ActionEvent actionEvent) {
        Game.context.transition(Direction.power_plant_outside);

        Game.textPrinter.printText("SIUUUUU");
    }

}

