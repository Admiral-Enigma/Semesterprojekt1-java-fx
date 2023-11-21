package com.st1.controllers;

import com.st1.ui.SceneManager;

public class ViewController {

    private SceneManager sceneManager;
    public void setSceneManager(SceneManager sceneManager) {
        this.sceneManager = sceneManager;
    }

    public SceneManager getSceneManager() {
        return sceneManager;
    }
}
