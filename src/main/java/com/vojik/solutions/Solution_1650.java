package com.vojik.solutions;

import java.util.HashSet;
import java.util.Set;

/** 1650. Lowest Common Ancestor of a Binary Tree III */
public class Solution_1650 {

  public Node lowestCommonAncestor(Node p, Node q) {
    Node a = p;
    Node b = q;
    while (a != b) {
      a = a == null ? q : a.parent;
      b = b == null ? p : b.parent;
    }
    return a;
  }

  public Node lowestCommonAncestor2(Node p, Node q) {
    Set<Node> set = new HashSet<>();
    while (p != null) {
      set.add(p);
      p = p.parent;
    }

    while (q != null) {
      if (set.contains(q)) {
        return q;
      }
      q = q.parent;
    }
    return null;
  }

  static class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
  }
  ;
}
