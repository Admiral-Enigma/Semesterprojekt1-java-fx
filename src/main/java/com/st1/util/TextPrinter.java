package com.st1.util;

import javafx.scene.control.TextArea;

public class TextPrinter {


    private TextArea messageArea;

    public TextPrinter () {

    }

    public void setMessageArea(TextArea messageArea) {
        this.messageArea = messageArea;
    }
    public void printText(String text) {
        messageArea.appendText(text + "\n\n");
    }
}
