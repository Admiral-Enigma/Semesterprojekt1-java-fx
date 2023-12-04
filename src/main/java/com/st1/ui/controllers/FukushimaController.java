package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.core.Direction;
import com.st1.inventory.items.SMRReactorCore;
import com.st1.inventory.items.SMRReactorVessel;
import com.st1.ui.components.ItemDrop;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class FukushimaController extends ViewController implements Initializable {
    public void gotoAirstrip(ActionEvent actionEvent) {
        Game.context.transition(Direction.airstrip);
    }

    public VBox reactorVesselItem;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SMRReactorVessel smrReactorVessel = new SMRReactorVessel();

        new ItemDrop(reactorVesselItem, smrReactorVessel);
    }
}
