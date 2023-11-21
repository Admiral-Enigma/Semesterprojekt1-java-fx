package com.st1.controllers;

import com.st1.Context;
import com.st1.inventory.items.Hakke;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;

import java.io.IOException;

public class StartController {
    @FXML
    private Label welcomeText;


    @FXML
    protected void onHelloButtonClick() throws IOException {
        Context.inventory.add(new Hakke());
        welcomeText.setFont(new Font("Comic Sans MS", 40));
        welcomeText.setText("Velkommen til Yurigistan Nuclear Bonanza!");
    }
}