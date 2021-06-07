package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/** 112. Path Sum */
public class Solution_112 {
  public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) {
      return false;
    }
    return dfs(root, targetSum, 0);
  }

  private boolean dfs(TreeNode root, int targetSum, int currentSum) {
    if (root == null) {
      return false;
    }
    if (isLeaf(root)) {
      return targetSum == currentSum + root.val;
    }
    return dfs(root.left, targetSum, currentSum + root.val)
        || dfs(root.right, targetSum, currentSum + root.val);
  }

  private boolean isLeaf(TreeNode root) {
    return root != null && root.left == null && root.right == null;
  }
}
