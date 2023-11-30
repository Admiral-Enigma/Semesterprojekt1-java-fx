package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.inventory.items.Coalkettle;
import com.st1.ui.components.ItemDrop;
import com.st1.core.Direction;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class PowerPlantBoilerController extends ViewController implements Initializable{
    public VBox Coalkettle;

    public Label title;

    public void goLobby(ActionEvent actionEvent) {
        Game.context.transition(Direction.power_plant_lobby);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Coalkettle coalkettle = new Coalkettle();

        new ItemDrop(Coalkettle, coalkettle);
    }
}
    /*
    public void buildReactor(ActionEvent actionEvent) {

        **INDSÆT FUNKTIONER TIL AT BYGGE TURBINE HER**
        }
     */