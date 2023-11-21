package com.st1.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuController extends ViewController implements Initializable {

    @FXML
    private Label titleText;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void onStartClick(ActionEvent actionEvent) {
        getSceneManager().transitionScene("game");
    }
}
