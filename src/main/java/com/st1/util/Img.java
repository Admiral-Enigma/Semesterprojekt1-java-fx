package com.st1.util;

import com.st1.Game;
import javafx.scene.image.Image;

public class Img {

    public static Image fromAssets(String filePath) {
        return new Image(Game.class.getResourceAsStream(filePath));
    }
}
