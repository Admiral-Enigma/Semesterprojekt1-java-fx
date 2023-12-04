package com.st1.ui.controllers;

import com.st1.Game;
import com.st1.core.Direction;
import com.st1.interact.Npc;
import com.st1.interact.ThoriumMan;
import com.st1.ui.components.NpcComponent;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class DeeperController extends ViewController implements Initializable {
    public Label title;
    public VBox triggerNPCVbox;
    public HBox npcContainer;
    public AnchorPane root;

    private NpcComponent thoriumQuiz;

    public void gotoSurface(ActionEvent actionEvent) {
        Game.context.transition(Direction.thorium_mine);

    }

    public void triggerNpc(MouseEvent mouseEvent) {
        root.getChildren().remove(triggerNPCVbox);
        this.thoriumQuiz.toogleVisibility();
        this.thoriumQuiz.render();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.thoriumQuiz = new NpcComponent(npcContainer, new ThoriumMan(), true);
    }
}
