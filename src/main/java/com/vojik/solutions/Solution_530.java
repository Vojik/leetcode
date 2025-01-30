package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/**
 * 530. Minimum Absolute Difference in BST
 */
public class Solution_530 {

  int minSoFar = Integer.MAX_VALUE;
  TreeNode prev;

  public int getMinimumDifference(TreeNode root) {
    dfs(root);
    return minSoFar;
  }

  private void dfs(TreeNode node) {
    if (node != null) {
      dfs(node.left);
      if (prev != null) {
        minSoFar = Math.min(minSoFar, node.val - prev.val);
      }
      prev = node;
      dfs(node.right);
    }
  }
}
