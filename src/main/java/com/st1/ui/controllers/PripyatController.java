package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.core.Direction;
import com.st1.interact.IntroMan;
import com.st1.interact.PripyatGirl;
import com.st1.interact.PripyatMan;
import com.st1.interact.PripyatGirl;
import com.st1.inventory.items.SMRReactorCore;
import com.st1.ui.components.ItemDrop;
import com.st1.ui.components.NpcComponent;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class PripyatController extends ViewController implements Initializable {
    public void gotoAirstrip(ActionEvent actionEvent) {
        Game.context.transition(Direction.airstrip);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        NpcComponent npc = new NpcComponent(pripyatmancontainer, new PripyatMan());
        NpcComponent npc2 = new NpcComponent(pripyatgirlcontainer, new PripyatGirl());

    }
    public HBox pripyatmancontainer;
    public HBox pripyatgirlcontainer;


}
