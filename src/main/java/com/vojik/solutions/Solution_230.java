package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/**
 * 230. Kth Smallest Element in a BST
 */
public class Solution_230 {

  private int counter = 0;
  private int ans = -1;

  public int kthSmallest(TreeNode root, int k) {
    dfs(root, k);
    return ans;
  }

  private void dfs(TreeNode node, int k) {
    if (node != null) {
      dfs(node.left, k);
      counter++;
      if (counter == k) {
        ans = node.val;
      }
      dfs(node.right, k);
    }
  }
}
