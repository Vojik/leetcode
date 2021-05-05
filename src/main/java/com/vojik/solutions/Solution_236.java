package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.Stack;

public class Solution_236 {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    Stack<TreeNode> stackP = new Stack<>();
    Stack<TreeNode> stackQ = new Stack<>();
    dfs(root, stackP, p);
    dfs(root, stackQ, q);

    while (stackP.size() > stackQ.size()) {
      stackP.pop();
    }
    while (stackQ.size() > stackP.size()) {
      stackQ.pop();
    }

    while (stackQ.peek() != stackP.peek()) {
      stackQ.pop();
      stackP.pop();
    }
    return stackQ.peek();
  }

  private boolean dfs(TreeNode root, Stack<TreeNode> stack, TreeNode target) {
    if (root == null) {
      return false;
    }
    stack.push(root);
    if (target == root) {
      return true;
    }

    if (dfs(root.left, stack, target) || dfs(root.right, stack, target)) {
      return true;
    }
    stack.pop();
    return false;
  }
}
