package com.st1.controllers;

import com.st1.Game;
import javafx.event.ActionEvent;

public class StartController extends ViewController{
    public void siuu(ActionEvent actionEvent) {
        Game.context.transition("road");

        Game.textPrinter.printText("SIUUUUU");
    }
}
