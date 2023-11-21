package com.st1.util;

import com.st1.Game;
import javafx.scene.image.Image;

public class Assets {

    public static Image imageFromPath(String filePath) {
        return new Image(Game.class.getResourceAsStream(filePath));
    }
}
