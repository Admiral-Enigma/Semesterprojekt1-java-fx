package com.st1.ui.controllers;

import com.st1.Game;
import javafx.event.ActionEvent;

public class PripyatController extends ViewController {
    public void gotoAirstrip(ActionEvent actionEvent) {
        Game.context.transition("airstrip");
    }

}
