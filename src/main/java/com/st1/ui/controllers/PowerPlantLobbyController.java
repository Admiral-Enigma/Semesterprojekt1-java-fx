package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.core.Direction;
import com.st1.inventory.items.SMRContainment;
import com.st1.ui.components.ItemDrop;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class PowerPlantLobbyController extends ViewController implements Initializable {

    public VBox containmentItem;

    public Label title;
    public VBox worker;
    public void goOutside(ActionEvent actionEvent) {
        Game.context.transition(Direction.power_plant_outside);
    }

    public void goTurbine(ActionEvent actionEvent) {
        Game.context.transition(Direction.power_plant_turbine);
    }

    public void goBoiler(ActionEvent actionEvent) {
        Game.context.transition(Direction.power_plant_boiler);
    }

    public void mcFeastify(ActionEvent actionEvent) {
        title.setText("MCFEAST BBBY");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        SMRContainment smrContainment = new SMRContainment();

        new ItemDrop(containmentItem, smrContainment);
    }
}
