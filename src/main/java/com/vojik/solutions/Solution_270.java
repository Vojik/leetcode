package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/** 270. Closest Binary Search Tree Value */
public class Solution_270 {

  public int closestValue(TreeNode root, double target) {
    int closest = root.val;
    while (root != null) {
      if (root.val == target) {
        return root.val;
      }
      if (Math.abs((double) root.val - target) < Math.abs((double) closest - target)) {
        closest = root.val;
      }

      if (root.val > target) {
        root = root.left;
      } else {
        root = root.right;
      }
    }
    return closest;
  }
}
