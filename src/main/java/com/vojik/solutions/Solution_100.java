package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 100. Same Tree
 */
public class Solution_100 {

  // Time: O(n) Space: O(n)
  public boolean isSameTreeRecursively(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }
    if (p == null || q == null) {
      return false;
    }
    if (p.val != q.val) {
      return false;
    }
    return isSameTreeRecursively(p.left, q.left) && isSameTreeRecursively(p.right, q.right);
  }

  // Time:O(n) Space: O(n)
  public boolean isSameTreeIteratively(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }
    if (p == null || q == null) {
      return false;
    }

    Deque<TreeNode> pDeq = new ArrayDeque<>();
    Deque<TreeNode> qDeq = new ArrayDeque<>();
    pDeq.addLast(p);
    qDeq.addLast(q);

    while (!pDeq.isEmpty()) {
      TreeNode pNode = pDeq.removeFirst();
      TreeNode qNode = qDeq.removeFirst();

      if (pNode.val != qNode.val) {
        return false;
      }

      if (!checkNodes(pNode.left, qNode.left) || !checkNodes(pNode.right, qNode.right)) {
        return false;
      }

      if (pNode.left != null) {
        pDeq.addLast(pNode.left);
        qDeq.addLast(qNode.left);
      }

      if (pNode.right != null) {
        pDeq.addLast(pNode.right);
        qDeq.addLast(qNode.right);
      }
    }
    return true;
  }


  private boolean checkNodes(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }
    if (p == null || q == null) {
      return false;
    }
    return true;
  }
}