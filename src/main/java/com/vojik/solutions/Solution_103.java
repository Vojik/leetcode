package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 103. Binary Tree Zigzag Level Order Traversal
 */
public class Solution_103 {

  // Time: O(n) Space:O(n)
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }

    Deque<TreeNode> deque = new ArrayDeque<>();
    deque.add(root);
    int level = 0;

    while (!deque.isEmpty()) {
      int size = deque.size();

      LinkedList<Integer> subList = new LinkedList<>();
      for (int i = 0; i < size; i++) {
        TreeNode node = deque.pollFirst();

        if (level % 2 != 0) {
          subList.addFirst(node.val);
        } else {
          subList.addLast(node.val);
        }

        if (node.left != null) {
          deque.addLast(node.left);
        }
        if (node.right != null) {
          deque.addLast(node.right);
        }
      }
      result.add(subList);
      level++;
    }
    return result;
  }
}
