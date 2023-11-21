package com.st1.core;/* com.st1.core.Node class for modeling graphs
 */

import java.util.HashMap;
import java.util.Map;

public class Node {
  String name;
  Map<String, Node> edges = new HashMap<String, Node>();
  
  Node (String name) {
    this.name = name;
  }
  
  public String getName () {
    return name;
  }
  
  public Node addEdge (String name, Node node) {
    edges.put(name, node);
    return this;
  }
  
  public Node followEdge (String direction) {
    return edges.get(direction);
  }
}

