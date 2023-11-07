package com.st1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private ImageView boximage;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hvad en McFeast smager af?");
        boximage.setImage(new Image("https://s7d1.scene7.com/is/image/mcdonalds/mcdonalds_mcfeast:1-3-product-tile-desktop?wid=829&hei=515&dpr=off"));
    }
}