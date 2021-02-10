package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution_1038 {

  public TreeNode bstToGst(TreeNode root) {
    // go to the right
    // add to sum and set value
    // set root == root.left
    TreeNode ans = root;
    Deque<TreeNode> deque = new ArrayDeque<>();
    int sum = 0;
    while (!deque.isEmpty() || root != null) {
      while (root != null) {
        deque.addLast(root);
        root = root.right;
      }
      TreeNode node = deque.pollLast();
      node.val += sum;
      sum = node.val;
      root = node.left;
    }
    return ans;
  }
}