package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/**
 * 156. Binary Tree Upside Down
 */
public class Solution_156 {

  private TreeNode newRoot;

  public TreeNode upsideDownBinaryTree(TreeNode root) {
    dfs(root, null);
    return newRoot;
  }

  private void dfs(TreeNode node, TreeNode parent) {
    if (node != null) {
      dfs(node.left, node);
      if (newRoot == null) {
        newRoot = node;
      }
      node.right = parent;
      node.left = parent == null ? null : parent.right;
    }
  }
}
