package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 102. Binary Tree Level Order Traversal
 */
public class Solution_102 {

  // Time: O(n) Space: O(n)
  public List<List<Integer>> levelOrderIteratively(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    Deque<TreeNode> deque = new ArrayDeque<>();
    deque.addFirst(root);
    while (!deque.isEmpty()) {
      int size = deque.size();
      List<Integer> levelList = new ArrayList<>();
      for (int i = 0; i < size; i++) {
        TreeNode node = deque.pollFirst();
        levelList.add(node.val);
        if (node.left != null) {
          deque.addLast(node.left);
        }
        if (node.right != null) {
          deque.addLast(node.right);
        }
      }
      result.add(levelList);
    }
    return result;
  }
}