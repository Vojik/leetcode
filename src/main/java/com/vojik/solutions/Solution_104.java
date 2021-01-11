package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/**
 * 104. Maximum Depth of Binary Tree
 */
public class Solution_104 {

  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return dfs(root, 1);
  }

  private int dfs(TreeNode root, int level) {
    if (root == null) {
      return level - 1;
    }
    return Math.max(dfs(root.left, level + 1), dfs(root.right, level + 1));
  }

}
