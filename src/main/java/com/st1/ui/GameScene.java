package com.st1.ui;

import com.st1.Game;
import com.st1.ui.controllers.ViewController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

public class GameScene {

    private Parent rootElement;
    private String fxmlPath;

    private SceneManager sceneManager;

    public GameScene(String fxmlPath, SceneManager sceneManager) {
        this.fxmlPath = fxmlPath;
        this.sceneManager = sceneManager;
    }



    public Parent getRootElement() {
        // Er scenen ikke allerede loadet så load den.
        if (rootElement == null) {
            rootElement = loadScene();
        }

        return rootElement;
    }


    private Parent loadScene() {
        Parent rootScene = null;

        FXMLLoader fxmlLoader = new FXMLLoader(Game.class.getResource(this.fxmlPath));

        try {
            rootScene = fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ViewController controller = fxmlLoader.getController();
        controller.setSceneManager(sceneManager);

        return rootScene;
    }

}
