package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/** 687. Longest Univalue Path */
public class Solution_687 {

  private int max;

  public int longestUnivaluePath(TreeNode root) {
    max = 0;
    dfs(root, Integer.MAX_VALUE);
    return max;
  }

  private int dfs(TreeNode node, int parentVal) {
    if (node == null) {
      return 0;
    }

    int left = dfs(node.left, node.val);
    int right = dfs(node.right, node.val);

    max = Math.max(max, left + right);

    if (node.val == parentVal) {
      return 1 + Math.max(left, right);
    }
    return 0;
  }
}
