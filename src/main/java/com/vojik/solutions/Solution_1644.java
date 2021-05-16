package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/** 1644. Lowest Common Ancestor of a Binary Tree II */
public class Solution_1644 {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    Map<TreeNode, TreeNode> parents = new HashMap<>();
    Stack<TreeNode> stack = new Stack<>();

    parents.put(root, null);
    stack.push(root);

    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();

      if (parents.containsKey(p) && parents.containsKey(q)) {
        break;
      }

      if (node.left != null) {
        parents.put(node.left, node);
        stack.push(node.left);
      }

      if (node.right != null) {
        parents.put(node.right, node);
        stack.push(node.right);
      }
    }

    if (!parents.containsKey(p) || !parents.containsKey(q)) {
      return null;
    }

    Set<TreeNode> set = new HashSet<>();
    while (p != null) {
      set.add(p);
      p = parents.get(p);
    }

    while (q != null) {
      if (set.contains(q)) {
        return q;
      }
      q = parents.get(q);
    }
    return null;
  }
}
