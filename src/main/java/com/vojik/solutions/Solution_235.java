package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/**
 * 235. Lowest Common Ancestor of a Binary Search Tree
 */
public class Solution_235 {

  // Time: O(log N) Space: O(log N)
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root.val < p.val && root.val < q.val) {
      return lowestCommonAncestor(root.right, p, q);
    }
    if (root.val > p.val && root.val > q.val) {
      return lowestCommonAncestor(root.left, p, q);
    }
    return root;
  }
}
