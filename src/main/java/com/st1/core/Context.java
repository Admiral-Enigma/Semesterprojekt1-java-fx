package com.st1.core;/* com.st1.core.Context class to hold all context relevant to a session.
 */

import com.st1.inventory.Inventory;

public class Context  {
  Space current;
  public  Inventory inventory;

  public Context(Space node) {
    current = node;
    inventory = new Inventory();
  }
  
  public Space getCurrent() {
    return current;
  }
  
  public void transition (Direction direction) {
    Space next = (Space) current.followEdge(direction.getName());

    if (next==null) {
      throw new RuntimeException("Unknown directon " + direction.getName());
    }

    current = next;
  }
}

