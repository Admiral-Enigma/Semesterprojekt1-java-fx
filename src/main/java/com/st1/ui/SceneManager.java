package com.st1.ui;

import com.st1.Game;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class SceneManager {

    private Stage stage;

    private Map<String, GameScene> scenes;


    public SceneManager(Stage stage) {
        this.stage = stage;
        this.scenes = new HashMap<>();
    }


    private void addScene(String name, GameScene scene) {
        this.scenes.put(name, scene);
    }

    public void createScene(String sceneName, String fxmlPath) {
        GameScene sceneInfo = new GameScene(fxmlPath, this);

        this.addScene(sceneName, sceneInfo);
    }


    public void transitionScene(String name) {
        if (!this.scenes.containsKey(name)) {
            System.err.println("Unknown scene name "+name);
            return;
        }


        GameScene scene = scenes.get(name);

        Scene currentScene = stage.getScene();

        Scene newScene = currentScene == null
                ? new Scene(scene.getRootElement())
                : new Scene(scene.getRootElement(), currentScene.getWidth(), currentScene.getHeight());
        stage.setScene(newScene);
        stage.show();
    }
}
