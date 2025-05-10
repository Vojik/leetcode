package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 662. Maximum Width of Binary Tree
 */
public class Solution_662 {

  public int widthOfBinaryTree(TreeNode root) {
    int maxWidth = 0;
    Deque<Pair<TreeNode, Integer>> queue = new ArrayDeque<>();
    queue.addFirst(new Pair(root, 1));

    while (!queue.isEmpty()) {
      int size = queue.size();
      int width = queue.getFirst().position - queue.getLast().position + 1;
      maxWidth = Math.max(maxWidth, width);
      for (int i = 0; i < size; i++) {
        Pair<TreeNode, Integer> pair = queue.removeLast();
        TreeNode node = pair.node;
        int position = pair.position;
        if (node.left != null) {
          queue.addFirst(new Pair(node.left, 2 * position));
        }
        if (node.right != null) {
          queue.addFirst(new Pair(node.right, 2 * position + 1));
        }
      }
    }
    return maxWidth;
  }

  class Pair<A extends TreeNode, B extends Integer> {

    A node;
    B position;

    Pair(A node, B position) {
      this.node = node;
      this.position = position;
    }
  }
}
