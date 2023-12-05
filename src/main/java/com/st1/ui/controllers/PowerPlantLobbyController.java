package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.core.Direction;
import com.st1.interact.IntroMan;
import com.st1.interact.PowerPlantMan;
import com.st1.inventory.items.SMRContainment;
import com.st1.ui.components.ItemDrop;
import com.st1.ui.components.NpcComponent;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class PowerPlantLobbyController extends ViewController implements Initializable {

    public Label title;
    public HBox powerPlantManContainer;
    public void goOutside(ActionEvent actionEvent) {
        Game.context.transition(Direction.power_plant_outside);
    }

    public void goTurbine(ActionEvent actionEvent) {
        Game.context.transition(Direction.power_plant_turbine);
    }

    public void goBoiler(ActionEvent actionEvent) {
        Game.context.transition(Direction.power_plant_boiler);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        NpcComponent npc  = new NpcComponent(powerPlantManContainer, new PowerPlantMan());
    }
}
