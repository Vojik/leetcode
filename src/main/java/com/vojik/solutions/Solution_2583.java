package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 2583. Kth Largest Sum in a Binary Tree
 */
public class Solution_2583 {

  public long kthLargestLevelSum(TreeNode root, int k) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    PriorityQueue<Long> pq = new PriorityQueue<>();
    while (!queue.isEmpty()) {
      int len = queue.size();
      long levelSum = 0;
      for (int i = 0; i < len; i++) {
        TreeNode node = queue.poll();
        levelSum += node.val;
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
      }
      pq.add(levelSum);
      if (pq.size() > k) {
        pq.poll();
      }
    }
    return k > pq.size() ? -1 : pq.poll();
  }
}
