package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/**
 * 110. Balanced Binary Tree
 */
public class Solution_110 {

  int maxDiff = 0;

  public boolean isBalanced(TreeNode root) {
    maxHeight(root);
    return maxDiff < 2;
  }

  private int maxHeight(TreeNode root) {
    if (root == null) {
      return 0;
    } else {
      int leftH = maxHeight(root.left);
      int rightH = maxHeight(root.right);
      maxDiff = Math.max(maxDiff, Math.abs(leftH - rightH));
      return 1 + Math.max(leftH, rightH);
    }
  }

}
