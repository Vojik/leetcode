package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/**
 * 1120. Maximum Average Subtree
 */
public class Solution_1120 {

  private double max = 0;

  public double maximumAverageSubtree(TreeNode root) {
    int[] arr = dfs(root);
    return Math.max((double) arr[0] / arr[1], max);
  }

  private int[] dfs(TreeNode node) {
    if (node == null) {
      return null;
    }

    int sum = node.val;
    int numNodes = 1;

    int[] left = dfs(node.left);
    if (left != null) {
      sum += left[0];
      numNodes += left[1];
    }
    int[] right = dfs(node.right);
    if (right != null) {
      sum += right[0];
      numNodes += right[1];
    }

    max = Math.max((double) sum / numNodes, max);
    return new int[]{sum, numNodes};
  }
}
