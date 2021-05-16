package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 236. Lowest Common Ancestor of a Binary Tree
 */
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

  // Time complexity: O(N)
  // Space complexity: O(N)
  public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
    Map<TreeNode,TreeNode> parents = new HashMap<>();
    Stack<TreeNode> stack = new Stack<>();

    parents.put(root, null);
    stack.push(root);

    while (!parents.containsKey(p) || !parents.containsKey(q)) {
      TreeNode node = stack.pop();

      if (node.left != null) {
        parents.put(node.left, node);
        stack.push(node.left);
      }

      if (node.right != null) {
        parents.put(node.right, node);
        stack.push(node.right);
      }
    }

    TreeNode a = p;
    TreeNode b = q;

    while (a != b) {
      a = a == null ? q : parents.get(a);
      b = b == null ? p : parents.get(b);
    }
    return a;
  }
}
