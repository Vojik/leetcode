package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.Stack;

/**
 * 173. Binary Search Tree Iterator
 */
public class Solution_173 {

  private Stack<TreeNode> stack;

  public Solution_173(TreeNode root) {
    this.stack = new Stack<>();
    addToStack(root);

  }

  public int next() {
    TreeNode node = stack.pop();
    addToStack(node.right);
    return node.val;
  }

  public boolean hasNext() {
    return !stack.isEmpty();
  }

  private void addToStack(TreeNode root) {
    while (root != null) {
      stack.push(root);
      root = root.left;
    }
  }
}
