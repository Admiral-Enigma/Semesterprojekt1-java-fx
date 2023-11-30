package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.inventory.items.SMRGenerator;
import com.st1.ui.components.ItemDrop;
import com.st1.core.Direction;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class PripyatController extends ViewController implements Initializable {

    public VBox SMRGenerator;
    public void gotoAirstrip(ActionEvent actionEvent) {
        Game.context.transition(Direction.airstrip);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SMRGenerator smrGenerator = new SMRGenerator();


        new ItemDrop(SMRGenerator, smrGenerator);
    }
}
