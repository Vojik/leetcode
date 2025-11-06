package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/**
 * 111. Minimum Depth of Binary Tree
 */
public class Solution_111 {

  int minDepth = Integer.MAX_VALUE;

  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    dfs(root, 0);
    return minDepth;
  }

  private void dfs(TreeNode node, int depth) {
    if (node != null) {
      if (node.left == null && node.right == null) {
        minDepth = Math.min(depth + 1, minDepth);
      } else {
        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
      }
    }
  }

}
