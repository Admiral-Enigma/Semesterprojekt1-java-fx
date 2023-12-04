package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.core.Direction;
import com.st1.inventory.items.SMRPressurizer;
import com.st1.ui.components.ItemDrop;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class PowerPlantBoilerController extends ViewController implements Initializable {

    public Label title;
    public VBox PressurizerItem;

    public void goLobby(ActionEvent actionEvent) {
        Game.context.transition(Direction.power_plant_lobby);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SMRPressurizer pressurizer = new SMRPressurizer();
        pressurizer.setQuantity(1);

        new ItemDrop(PressurizerItem, pressurizer);
    }
}
    /*
    public void buildReactor(ActionEvent actionEvent) {

        **INDSÆT FUNKTIONER TIL AT BYGGE TURBINE HER**
        }
     */