package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.ArrayDeque;
import java.util.Deque;

/** 101. Symmetric Tree */
public class Solution_101 {

  public boolean isSymmetric(TreeNode root) {
    return isSymmetric(root.left, root.right);
  }

  private boolean isSymmetric(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    }
    if (left == null || right == null) {
      return false;
    }
    if (left.val != right.val) {
      return false;
    }
    return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
  }

  public boolean isSymmetricIteratively(TreeNode root) {
    Deque<TreeNode> deque = new ArrayDeque<>();
    if (root.left != null) {
      deque.addFirst(root.left);
    }
    if (root.right != null) {
      deque.addLast(root.right);
    }
    if (deque.size() == 1) {
      return false;
    }

    while (!deque.isEmpty()) {
      TreeNode left = deque.removeFirst();
      TreeNode right = deque.removeLast();
      if (left.val != right.val) {
        return false;
      }
      if (left.left != null && right.right != null) {
        deque.addFirst(left.left);
        deque.addLast(right.right);
      } else if (left.left != null || right.right != null) {
        return false;
      }

      if (left.right != null && right.left != null) {
        deque.addFirst(left.right);
        deque.addLast(right.left);
      } else if (left.right != null || right.left != null) {
        return false;
      }
    }
    return true;
  }
}
