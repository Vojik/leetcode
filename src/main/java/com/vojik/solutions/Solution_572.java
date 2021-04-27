package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/**
 * 572. Subtree of Another Tree
 */
public class Solution_572 {

  // Time: O(n * m)
  // Space: O(n)
  public boolean isSubtree(TreeNode s, TreeNode t) {
    if (s == null) {
      return false;
    }
    if (s.val == t.val && checkSubTree(s, t)) {
      return true;
    }
    return isSubtree(s.left, t) || isSubtree(s.right, t);
  }

  private boolean checkSubTree(TreeNode s, TreeNode t) {
    if (s == null && t == null) {
      return true;
    }
    if (s == null || t == null) {
      return false;
    }
    if (s.val != t.val) {
      return false;
    }
    return checkSubTree(s.left, t.left) && checkSubTree(s.right, t.right);
  }
}
