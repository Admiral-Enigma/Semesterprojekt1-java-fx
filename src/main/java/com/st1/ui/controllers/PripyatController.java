package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.core.Direction;
import com.st1.interact.IntroMan;
import com.st1.interact.PripyatMan;
import com.st1.inventory.items.SMRReactorCore;
import com.st1.ui.components.ItemDrop;
import com.st1.ui.components.NpcComponent;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class PripyatController extends ViewController implements Initializable {
    public void gotoAirstrip(ActionEvent actionEvent) {
        Game.context.transition(Direction.airstrip);
    }

    public VBox reactorCoreItem;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SMRReactorCore smrReactorCore = new SMRReactorCore();

        new ItemDrop(reactorCoreItem, smrReactorCore);
        NpcComponent npc = new NpcComponent(pripyatmancontainer, new PripyatMan());

    }
    public HBox pripyatmancontainer;


}
