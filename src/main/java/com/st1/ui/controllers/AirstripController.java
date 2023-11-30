package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.core.Direction;
import javafx.event.ActionEvent;

public class AirstripController extends ViewController{

    public void goFukushima(ActionEvent actionEvent) {
        Game.context.transition(Direction.fukushima);
    }
    public void goPripyat(ActionEvent actionEvent) {
        Game.context.transition(Direction.pripyat);
    }
    public void goPowerPlant(ActionEvent actionEvent) {
        Game.context.transition(Direction.power_plant_outside);}
    public void goThoriumMine(ActionEvent actionEvent) {
        Game.context.transition(Direction.thorium_mine);}
    public void goStripClub(ActionEvent actionEvent) {
        //Game.context.transition("strip_club");
    }
}
