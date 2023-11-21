package com.st1;/* com.st1.Context class to hold all context relevant to a session.
 */

import com.st1.inventory.Inventory;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

import java.util.ArrayList;
import java.util.List;

public class Context implements Observable {
  Space current;
  public  Inventory inventory;

  private List<InvalidationListener> listeners = new ArrayList<>();

  Context (Space node) {
    current = node;
    inventory = new Inventory();
  }
  
  public Space getCurrent() {
    return current;
  }
  
  public void transition (String direction) {
    Space next = (Space) current.followEdge(direction);
    if (next==null) {
      System.out.println("You are confused, and walk in a circle looking for '"+direction+"'. In the end you give up 😩");
    } else {
      current.goodbye();
      current = next;
      current.welcome();
      notifyObservers();
    }
  }

  @Override
  public void addListener(InvalidationListener invalidationListener) {
    listeners.add(invalidationListener);

  }

  @Override
  public void removeListener(InvalidationListener invalidationListener) {
    listeners.remove(invalidationListener);
  }

  private void notifyObservers() {
    for (InvalidationListener listener : listeners) {
      listener.invalidated(this);
    }
  }



}

