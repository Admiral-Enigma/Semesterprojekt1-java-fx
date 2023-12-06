package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.core.Direction;
import com.st1.inventory.items.Kulkraftværkskedel;
import com.st1.inventory.items.SMRPressurizer;
import com.st1.ui.components.ItemDrop;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.fxml.Initializable;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class PowerPlantBoilerController extends ViewController implements Initializable {

    public Label title;
    public VBox PressurizerItem;
    public ImageView containmentVessel;
    public Text checklistTitle;
    public Text containmentChecklistItem;
    public Text reactorVesselChecklistItem;
    public Text reactorCoreChecklistItem;
    public Text thoriumChecklistItem;
    public Text pressurizerChecklistItem;
    public ImageView pressurizer;
    public Text turbineChecklistItem;
    public Text coolantChecklistItem;
    public VBox coalPlant;
    public Text coalPowerPlantChecklistItem;
    public Text generatorChecklistItem;

    public void goLobby(ActionEvent actionEvent) {
        Game.context.transition(Direction.power_plant_lobby);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        new ItemDrop(coalPlant, new Kulkraftværkskedel());
        SMRPressurizer pressurizer = new SMRPressurizer();
        pressurizer.setQuantity(1);

        new ItemDrop(PressurizerItem, pressurizer);
        updateCheckList();

        containmentVessel.setVisible(false);
        this.pressurizer.setVisible(false);

        Game.newReactorState.addListener(e -> {
            updateCheckList();
        });
    }


    private void updateCheckList() {
        if (Game.newReactorState.isContainmentVesselPlaced()) {
            updateCheckListItem(containmentChecklistItem);
            containmentVessel.setVisible(true);
        }

        if (Game.newReactorState.isReactorVesselPlaced()) {
            updateCheckListItem(reactorVesselChecklistItem);
        }

        if (Game.newReactorState.isReactorCorePlaced()) {
            updateCheckListItem(reactorCoreChecklistItem);
        }

        if (Game.newReactorState.isReactorFueled()) {
            updateCheckListItem(thoriumChecklistItem);
        }

        if (Game.newReactorState.isPressurizerPlaced()) {
            updateCheckListItem(pressurizerChecklistItem);
            pressurizer.setVisible(true);
        }

        if (Game.newReactorState.isCoolantCirculationPlaced()) {
            updateCheckListItem(coolantChecklistItem);
        }

        if (Game.newReactorState.isTurbinePlaced()) {
            updateCheckListItem(turbineChecklistItem);
        }

        if (Game.newReactorState.isOldPowerPlantRemoved()) {
            updateCheckListItem(coalPowerPlantChecklistItem);
        }

        if (Game.newReactorState.isGeneratorPlaced()) {
            updateCheckListItem(generatorChecklistItem);
        }
    }


    private void updateCheckListItem(Text item) {
        item.setFill(Color.LIGHTGREEN);
        item.setStroke(Color.BLACK);
        item.setText(item.getText().replace("❌", "✅"));
    }
}