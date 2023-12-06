package com.st1.core;

import com.st1.interact.BaseNpc;
import com.st1.ui.GameScene;


public class Space extends Node {
  public GameScene getGameScene() {
    return gameScene;
  }

  public void setGameScene(GameScene gameScene) {
    this.gameScene = gameScene;
  }

  private GameScene gameScene;

  public Space(String name) {
    super(name);
  }
}
