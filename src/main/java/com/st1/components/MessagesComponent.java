package com.st1.components;

import com.st1.Game;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.io.PrintStream;
import java.net.URL;
import java.util.ResourceBundle;

public class MessagesComponent extends SimpleComponent implements Initializable {

    @FXML
    private TextArea textArea;

    public MessagesComponent() {
        super("components/messages-component.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Game.textPrinter.setMessageArea(textArea);
    }
}
