package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 222. Count Complete Tree Nodes
 */
public class Solution_222 {

  public int countNodes(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int res = 0;
    Deque<TreeNode> deque = new ArrayDeque<>();
    deque.addFirst(root);
    int level = 0;
    while (!deque.isEmpty()) {
      int size = deque.size();
      int fullSize = (int) Math.pow(2, level);
      if (size != fullSize) {
        res += size;
        return res;
      } else {
        res += fullSize;
      }
      for (int i = 0; i < size; i++) {
        TreeNode node = deque.removeLast();
        if (node.left != null) {
          deque.addFirst(node.left);
        }
        if (node.right != null) {
          deque.addFirst(node.right);
        }
      }
      level++;
    }
    return res;
  }
}
