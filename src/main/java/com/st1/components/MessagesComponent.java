package com.st1.components;

import com.st1.Game;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.io.PrintStream;
import java.net.URL;
import java.util.ResourceBundle;

public class MessagesComponent {

    private TextArea textArea;

    public MessagesComponent(TextArea textArea) {
        this.textArea = textArea;
        Game.textPrinter.setMessageArea(textArea);
    }
}
