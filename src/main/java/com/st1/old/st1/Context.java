package com.st1.old.st1;/* com.st1.Context class to hold all context relevant to a session.
 */

import com.st1.inventory.Inventory;

public class Context {
  Space current;
  public static Inventory inventory;
  Context (Space node) {

    current = node;
    inventory = new Inventory();
  }
  
  public Space getCurrent() {
    return current;
  }
  
  public void transition (String direction) {
    Space next = current.followEdge(direction);
    if (next==null) {
      System.out.println("You are confused, and walk in a circle looking for '"+direction+"'. In the end you give up 😩");
    } else {
      current.goodbye();
      current = next;
      current.welcome();
    }
  }
}

