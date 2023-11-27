package com.st1.ui.controllers;

import com.st1.Game;
import javafx.event.ActionEvent;

public class AirstripController extends ViewController{

    public void goFukushima(ActionEvent actionEvent) {
        Game.context.transition("fukushima");
    }
    public void goPripyat(ActionEvent actionEvent) {
        Game.context.transition("pripyat");
    }
    public void goPowerPlant(ActionEvent actionEvent) {
        Game.context.transition("power_plant");}
    public void goThoriumMine(ActionEvent actionEvent) {
        Game.context.transition("thorium_mine");}
    public void goStripClub(ActionEvent actionEvent) {
        Game.context.transition("strip_club");
    }
}
