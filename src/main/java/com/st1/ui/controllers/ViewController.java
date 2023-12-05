package com.st1.ui.controllers;

import com.st1.ui.SceneManager;

import java.net.URL;
import java.util.ResourceBundle;

public abstract class ViewController {

    private SceneManager sceneManager;
    public void setSceneManager(SceneManager sceneManager) {
        this.sceneManager = sceneManager;
    }

    public SceneManager getSceneManager() {
        return sceneManager;
    }

}
