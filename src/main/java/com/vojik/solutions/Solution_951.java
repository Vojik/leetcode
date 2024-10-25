package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/**
 * 951. Flip Equivalent Binary Trees
 */
public class Solution_951 {

  public boolean flipEquiv(TreeNode root1, TreeNode root2) {
    if (root1 == null && root2 == null) {
      return true;
    }
    if (root1 == null || root2 == null) {
      return false;
    }
    if (root1.val != root2.val) {
      return false;
    }

    boolean noSwap = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
    boolean swap = flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
    return noSwap || swap;
  }
}
