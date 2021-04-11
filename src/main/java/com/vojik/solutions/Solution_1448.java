package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

public class Solution_1448 {

  public int goodNodes(TreeNode root) {
    return dfs(root, Integer.MIN_VALUE);
  }

  private int dfs(TreeNode node, int max) {
    if (node == null) {
      return 0;
    }
    int count = 0;
    if (node.val >= max) {
      count++;
      max = node.val;
    }

    count += dfs(node.left, max);
    count += dfs(node.right, max);
    return count;
  }

}
