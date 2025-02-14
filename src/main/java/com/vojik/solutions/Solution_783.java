package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 783. Minimum Distance Between BST Nodes
 */
public class Solution_783 {

  private int minDistance = Integer.MAX_VALUE;
  private TreeNode prev;

  public int minDiffInBST(TreeNode root) {
    dfs(root);
    return minDistance;
  }

  private void dfs(TreeNode node) {
    if (node != null) {
      dfs(node.left);
      if (prev != null) {
        minDistance = Math.min(minDistance, Math.abs(node.val - prev.val));
      }
      prev = node;
      dfs(node.right);
    }
  }
}
