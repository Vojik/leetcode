package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/**
 * 1315. Sum of Nodes with Even-Valued Grandparent
 */
public class Solution_1315 {

  public int sumEvenGrandparent(TreeNode root) {
    return sumEvenGrandparent(root, null, null);
  }

  private int sumEvenGrandparent(TreeNode root, TreeNode parent, TreeNode grandparent) {
    int sum = 0;
    if (root == null) {
      return sum;
    }
    if (parent != null && grandparent != null && grandparent.val % 2 == 0) {
      sum += root.val;
    }
    return sum + sumEvenGrandparent(root.left, root, parent) + sumEvenGrandparent(root.right, root,
        parent);
  }

}
