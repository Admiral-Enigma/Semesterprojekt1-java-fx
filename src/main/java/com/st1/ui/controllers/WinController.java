package com.st1.ui.controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WinController extends ViewController{

    @FXML
    private Label titleText;

    public void onEndClick(ActionEvent actionEvent) {
        Platform.exit();
                System.exit(0);
    }
}
