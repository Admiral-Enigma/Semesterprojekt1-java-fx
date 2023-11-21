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
    private ImageView boximage;

    @FXML
    protected void onHelloButtonClick() throws IOException {
        Context.inventory.add(new Hakke());
        welcomeText.setFont(new Font("Comic Sans MS", 40));
        welcomeText.setText("Velkommen til Yurigistan Nuclear Bonanza!");
        boximage.setImage(new Image("https://s7d1.scene7.com/is/image/mcdonalds/mcdonalds_mcfeast:1-3-product-tile-desktop?wid=829&hei=515&dpr=off"));
    }
}