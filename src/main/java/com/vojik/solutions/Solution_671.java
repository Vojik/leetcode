package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/**
 * 671. Second Minimum Node In a Binary Tree
 */
public class Solution_671 {

  private int firstMin;
  private long secondMin = Long.MAX_VALUE;

  public int findSecondMinimumValue(TreeNode root) {
    firstMin = root.val;
    dfs(root);
    return secondMin == Long.MAX_VALUE ? -1 : (int) secondMin;
  }

  private void dfs(TreeNode node) {
    if (node != null) {
      if (node.val != firstMin) {
        secondMin = Math.min(secondMin, node.val);
      }
      dfs(node.left);
      dfs(node.right);
    }
  }
}
