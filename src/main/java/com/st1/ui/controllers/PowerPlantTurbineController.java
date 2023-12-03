package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.core.GameState;
import com.st1.core.Direction;
import com.st1.inventory.items.SMRCoolantCirculation;
import com.st1.ui.components.ItemDrop;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class PowerPlantTurbineController extends ViewController implements Initializable {
    public Label title;
    public VBox CoolantItem;

    public void goLobby(ActionEvent actionEvent) {
        Game.context.transition(Direction.power_plant_lobby);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SMRCoolantCirculation coolant = new SMRCoolantCirculation();
        coolant.setQuantity(1);

        new ItemDrop(CoolantItem, coolant);
    }
}


    /*
    public void buildTurbine(ActionEvent actionEvent) {

        **INDSÆT FUNKTIONER TIL AT BYGGE TURBINE HER**
        }
     */