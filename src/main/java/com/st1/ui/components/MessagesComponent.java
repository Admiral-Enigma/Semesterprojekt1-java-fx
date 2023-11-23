package com.st1.ui.components;

import com.st1.Game;
import javafx.scene.control.TextArea;

public class MessagesComponent {

    private TextArea textArea;

    public MessagesComponent(TextArea textArea) {
        this.textArea = textArea;
        Game.textPrinter.setMessageArea(textArea);
    }
}
