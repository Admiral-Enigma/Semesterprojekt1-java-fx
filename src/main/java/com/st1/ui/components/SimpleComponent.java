package com.st1.ui.components;

import com.st1.Game;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class SimpleComponent extends AnchorPane implements ViewComponent {

    public SimpleComponent(String fxmlPath) {
        FXMLLoader fxmlLoader = new FXMLLoader(Game.class.getResource(fxmlPath));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }


    public void render() {

    };
}
