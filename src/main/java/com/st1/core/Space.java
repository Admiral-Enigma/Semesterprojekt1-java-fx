package com.st1.core;

import com.st1.Game;
import com.st1.interact.BaseNpc;
import com.st1.interact.HasQuiz;
import com.st1.inventory.Item;
import com.st1.ui.GameScene;

import java.util.HashMap;


public class Space extends Node {
  private HashMap<String, Item> items = new HashMap<String, Item>();
  private String firstVisit;
  private String normalVisit;
  private boolean visited = false;

  public GameScene getGameScene() {
    return gameScene;
  }

  public void setGameScene(GameScene gameScene) {
    this.gameScene = gameScene;
  }

  private GameScene gameScene;

  public BaseNpc getNpc() {
    return npc;
  }

  private BaseNpc npc;

  public Space(String name, String firstVisit, String normalVisit) {
    super(name);
    this.firstVisit = firstVisit;
    this.normalVisit = normalVisit;
  }


  public Space addItem(Item item) {
    items.put(item.getId(), item);
    return this;
  }

  public boolean hasItem(String name) {
    return items.get(name) != null;
  }

  public Item getItem(String name) {
    Item item = items.get(name);
    items.remove(name);
    return item;
  }

  public void welcome() {
    if (npc != null) {
      if (npc instanceof HasQuiz && !((HasQuiz) npc).getQuiz().hasBeenCompleted()) {
        ((HasQuiz) npc).renderQuiz();
        Game.state = GameState.IN_QUIZ;
      } else {
        if (!visited) {
          npc.firstSightingMessage();
          visited = true;
        } else {
          npc.normalSightingMessage();
        }
      }
    }

    if (npc == null) {
      if (!visited) {
        Game.textPrinter.printText(firstVisit);
        visited = true;
      } else {
        Game.textPrinter.printText(normalVisit);
      }
    }
  }


  public void setNpc(BaseNpc npc) {
    this.npc = npc;
  }

  public void goodbye() {
    // Implementation for the goodbye method
  }


  public void listItems() {
    if (items.isEmpty()) {
      Game.textPrinter.printText("Hmm.. Der ser ikke ud til at være nogle items i dette rum");
    } else {
      Game.textPrinter.printText("Items i dette rum:");
      for (Item item : items.values()) {
        System.out.printf(" - %s x [%s] %s%n", item.getQuantity(), item.getId(), item.getName());
      }
    }
  }

}
