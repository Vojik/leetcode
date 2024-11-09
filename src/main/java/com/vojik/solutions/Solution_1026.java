package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/**
 * 1026. Maximum Difference Between Node and Ancestor
 */
public class Solution_1026 {

  int maxDiff = 0;

  public int maxAncestorDiff(TreeNode root) {
    helper(root, root.val, root.val);
    return maxDiff;
  }

  private void helper(TreeNode node, int min, int max) {
    if (node != null) {
      maxDiff = Math.max(Math.max(Math.abs(node.val - min), Math.abs(node.val - max)), maxDiff);
      min = Math.min(min, node.val);
      max = Math.max(max, node.val);
      helper(node.left, min, max);
      helper(node.right, min, max);
    }
  }
}
