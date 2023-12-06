package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.core.Direction;
import com.st1.interact.FukushimaKid;
import com.st1.interact.FukushimaMan;
import com.st1.interact.PripyatMan;
import com.st1.interact.ThoriumMan;
import com.st1.inventory.items.SMRReactorCore;
import com.st1.inventory.items.SMRReactorVessel;
import com.st1.ui.components.ItemDrop;
import com.st1.ui.components.NpcComponent;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class FukushimaController extends ViewController implements Initializable {


    public HBox fukushimamancontainer;
    public VBox triggerNPCVbox;
    public HBox npcContainer;
    public AnchorPane root;

    private NpcComponent fukushimaQuiz;



    public void gotoAirstrip(ActionEvent actionEvent) {
        Game.context.transition(Direction.airstrip);
    }

    public HBox fukushimamancontainer;
    public VBox reactorVesselItem;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SMRReactorVessel smrReactorVessel = new SMRReactorVessel();

        new ItemDrop(reactorVesselItem, smrReactorVessel);
        NpcComponent npc = new NpcComponent(fukushimamancontainer, new FukushimaMan());
        this.fukushimaQuiz = new NpcComponent(npcContainer, new FukushimaKid(), true);
    }

    public void triggerNpc(MouseEvent mouseEvent) {
        root.getChildren().remove(triggerNPCVbox);
        this.fukushimaQuiz.toogleVisibility();
        this.fukushimaQuiz.render();
    }

}
