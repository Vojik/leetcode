package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.Stack;

public class Solution_98 {

  // Time: O(n) Space: O(n)
  public boolean isValidBST(TreeNode root) {
    if (root == null) {
      return true;
    }
    return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
  }

  private boolean isValidBST(TreeNode root, long min, long max) {
    if (root == null) {
      return true;
    }
    if (root.val <= min || root.val >= max) {
      return false;
    }

    return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
  }


  // Time: O(n) Space: O(n)
  public boolean isValidBST2(TreeNode root) {
    if (root == null) {
      return true;
    }
    Stack<TreeNode> stack = new Stack<>();
    long leftChildValue = Long.MIN_VALUE;

    while (!stack.isEmpty() || root != null) {

      while (root != null) {
        stack.push(root);
        root = root.left;
      }

      root = stack.pop();
      if (root.val <= leftChildValue) {
        return false;
      }
      leftChildValue = root.val;
      root = root.right;
    }
    return true;
  }
}
