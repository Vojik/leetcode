package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

public class Solution_700 {

  // Time: O(log(n)) Space: O(n)
  public TreeNode searchBST(TreeNode root, int val) {
    if (root == null) {
      return null;
    }
    if (root.val == val) {
      return root;
    }
    return root.val < val ? searchBST(root.right, val) : searchBST(root.left, val);
  }
}