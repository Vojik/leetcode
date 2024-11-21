package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.LinkedList;

/**
 * 958. Check Completeness of a Binary Tree
 */
public class Solution_958 {

  public boolean isCompleteTree(TreeNode root) {
    LinkedList<TreeNode> deque = new LinkedList<>();
    deque.add(root);
    boolean missed = false;
    while (!deque.isEmpty()) {
      int size = deque.size();
      for (int i = 0; i < size; i++) {
        TreeNode node = deque.poll();

        if (node == null) {
          missed = true;
        } else {
          if (missed) {
            return false;
          }
          deque.add(node.left);
          deque.add(node.right);
        }
      }
    }
    return true;
  }
}
