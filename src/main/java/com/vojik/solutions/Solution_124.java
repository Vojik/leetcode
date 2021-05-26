package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/** 124. Binary Tree Maximum Path Sum */
public class Solution_124 {

  int answer;

  public int maxPathSum(TreeNode root) {
    this.answer = Integer.MIN_VALUE;
    dfs(root);
    return answer;
  }

  private int dfs(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int left = Math.max(dfs(root.left), 0);
    int right = Math.max(dfs(root.right), 0);

    int pathSum = root.val + left + right;

    answer = Math.max(answer, pathSum);

    return root.val + Math.max(left, right);
  }
}
