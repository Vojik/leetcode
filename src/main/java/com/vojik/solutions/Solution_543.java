package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/** 543. Diameter of Binary Tree */
public class Solution_543 {

  private int diameter;

  public Solution_543() {
    this.diameter = 0;
  }

  public int diameterOfBinaryTree(TreeNode root) {
    dfs(root);
    return diameter;
  }

  private int dfs(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int longestLeft = dfs(root.left);
    int longestRight = dfs(root.right);

    diameter = Math.max(diameter, longestLeft + longestRight);

    return 1 + Math.max(longestLeft, longestRight);
  }
}
