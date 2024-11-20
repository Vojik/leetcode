package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * 173. Binary Search Tree Iterator
 */
public class Solution_173 {

  private Deque<TreeNode> deque = new ArrayDeque<>();

  public Solution_173(TreeNode root) {
    populateStackWithLeftMost(root);
  }

  public int next() {
    TreeNode node = deque.removeLast();
    if (node.right != null) {
      populateStackWithLeftMost(node.right);
    }
    return node.val;
  }

  public boolean hasNext() {
    return !deque.isEmpty();
  }

  private void populateStackWithLeftMost(TreeNode node) {
    while (node != null) {
      deque.addLast(node);
      node = node.left;
    }
  }
}
