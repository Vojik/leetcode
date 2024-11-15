package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/** 987. Vertical Order Traversal of a Binary Tree */
public class Solution_987 {

  private int minCol = Integer.MAX_VALUE;
  private final Map<Integer, List<TreeNodeWithLevel>> columnarMap = new HashMap<>();

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

  public List<List<Integer>> verticalTraversal2(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    helper(root, 0, 0);
    for (int i = minCol; i < columnarMap.size() + minCol; i++) {
      List<TreeNodeWithLevel> list = columnarMap.get(i);
      list.sort((a, b) -> {
        if (a.col - b.col != 0) {
          return a.col - b.col;
        } else if (a.row - b.row != 0) {
          return a.row - b.row;
        } else {
          return a.val - b.val;
        }
      });

      result.add(list.stream().map(node -> node.val).collect(Collectors.toList()));
    }
    return result;
  }

  private void helper(TreeNode node, int column, int row) {
    if (node == null)
      return;
    minCol = Math.min(minCol, column);
    List<TreeNodeWithLevel> list = columnarMap.getOrDefault(column, new ArrayList<TreeNodeWithLevel>());
    list.add(new TreeNodeWithLevel(node.val, row, column));
    columnarMap.put(column, list);
    helper(node.left, column - 1, row + 1);
    helper(node.right, column + 1, row + 1);
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
