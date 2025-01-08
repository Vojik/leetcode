package com.vojik.solutions;

import com.vojik.helpers.Node;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 589. N-ary Tree Preorder Traversal
 */
public class Solution_589 {

  public List<Integer> preorder(Node root) {
    List<Integer> result = new ArrayList<>();
    helper(root, result);
    return result;
  }

  private void helper(Node root, List<Integer> result) {
    if (root != null) {
      result.add(root.val);
      for (Node c : root.neighbors) {
        helper(c, result);
      }
    }
  }

  public List<Integer> preorderIterative(Node root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }

    Deque<Node> deque = new ArrayDeque<>();
    deque.addLast(root);

    while (!deque.isEmpty()) {
      Node node = deque.removeLast();
      result.add(node.val);
      for (int i = node.neighbors.size() - 1; i >= 0; i--) {
        deque.addLast(node.neighbors.get(i));
      }
    }
    return result;
  }
}
