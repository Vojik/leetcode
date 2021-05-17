package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/** 987. Vertical Order Traversal of a Binary Tree */
public class Solution_987 {

  // Time Complexity: O(NlogN)
  // Space Complexity: O(N)
  public List<List<Integer>> verticalTraversal(TreeNode root) {
    PriorityQueue<TreeNodeWithLevel> queue =
        new PriorityQueue<>(
            (a, b) -> {
              if (a.col - b.col != 0) {
                return a.col - b.col;
              } else if (a.row - b.row != 0) {
                return a.row - b.row;
              } else {
                return a.val - b.val;
              }
            });

    dfs(root, queue, 0, 0);
    List<List<Integer>> result = new ArrayList<>();
    TreeNodeWithLevel prev = null;
    TreeNodeWithLevel cur = queue.poll();

    List<Integer> list = new ArrayList<>();

    while (cur != null) {
      if (prev != null && cur.col != prev.col) {
        result.add(new ArrayList<>(list));
        list = new ArrayList<>();
      }
      list.add(cur.val);

      prev = cur;
      cur = queue.poll();
    }
    result.add(list);
    return result;
  }

  private void dfs(TreeNode root, PriorityQueue<TreeNodeWithLevel> queue, int row, int col) {
    if (root != null) {
      queue.add(new TreeNodeWithLevel(root.val, row, col));
      dfs(root.left, queue, row + 1, col - 1);
      dfs(root.right, queue, row + 1, col + 1);
    }
  }

  static class TreeNodeWithLevel {
    int val;
    int row;
    int col;

    TreeNodeWithLevel(int val, int row, int col) {
      this.val = val;
      this.row = row;
      this.col = col;
    }
  }
}
