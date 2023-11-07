package com.st1.old.st1;

import java.util.HashMap;
import java.util.Set;

import com.st1.GameState;
import com.st1.interact.BaseNpc;
import com.st1.interact.HasQuiz;
import com.st1.inventory.Item;


public class Space extends Node {
  private HashMap<String, Item> items = new HashMap<String, Item>();
  private String firstVisit;
  private String normalVisit;
  private boolean visited = false;

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
        printPossibleDirections();
      }
    }

    if (npc == null) {
      if (!visited) {
        System.out.println(firstVisit);
        visited = true;
      } else {
        System.out.println(normalVisit);
      }
      printPossibleDirections();
    }
  }

  private void printPossibleDirections() {
    Set<String> exits = edges.keySet();
    System.out.println("Du kan gå disse steder hen:");
    for (String exit : exits) {
      System.out.println(" - " + exit);
    }
  }

  public void setNpc(BaseNpc npc) {
    this.npc = npc;
  }

  public void goodbye() {
    // Implementation for the goodbye method
  }

  @Override
  public Space followEdge(String direction) {
    return (Space) super.followEdge(direction);
  }

  public void listItems() {
    if (items.isEmpty()) {
      System.out.println("Hmm.. Der ser ikke ud til at være nogle items i dette rum");
    } else {
      System.out.println("Items i dette rum:");
      for (Item item : items.values()) {
        System.out.printf(" - %s x [%s] %s%n", item.getQuantity(), item.getId(), item.getName());
      }
    }
  }

}
