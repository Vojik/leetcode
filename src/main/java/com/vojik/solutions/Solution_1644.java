package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/** 1644. Lowest Common Ancestor of a Binary Tree II */
public class Solution_1644 {

  private boolean foundP = false;
  private boolean foundQ = false;

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    TreeNode result = dfs(root, p, q);
    return foundP && foundQ ? result : null;
  }

  public TreeNode dfs(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null) {
      return null;
    }

    TreeNode left = dfs(root.left, p, q);
    TreeNode right = dfs(root.right, p, q);

    if (root == p) {
      foundP = true;
      return root;
    }

    if (root == q) {
      foundQ = true;
      return root;
    }

    if (left != null && right != null) {
      return root;
    }
    return left != null ? left : right;
  }

  public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
    TreeNode result = findLowestCommonAncestor(root, p, q);
    if (result == p) {
      return dfs(p, q) ? p : null;
    } else if (result == q) {
      return dfs(q, p) ? q : null;
    } else {
      return result;
    }
  }

  private TreeNode findLowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {
    if (node == null || node == p || node == q) {
      return node;
    }

    TreeNode left = findLowestCommonAncestor(node.left, p, q);
    TreeNode right = findLowestCommonAncestor(node.right, p, q);

    if (left != null && right != null) {
      return node;
    }
    return left != null ? left : right;
  }

  private boolean dfs(TreeNode node, TreeNode target) {
    if (node == target) return true;
    if (node == null) return false;
    return dfs(node.left, target) || dfs(node.right, target);
  }

  public TreeNode lowestCommonAncestor3(TreeNode root, TreeNode p, TreeNode q) {
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
