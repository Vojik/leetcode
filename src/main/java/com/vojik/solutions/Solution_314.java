package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/** 314. Binary Tree Vertical Order Traversal */
public class Solution_314 {

  public List<List<Integer>> verticalOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    Map<Integer, List<Integer>> colToValues = new HashMap<>();
    Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
    queue.add(new Pair(root, 0));

    int minColumn = 0;
    int maxColumn = 0;

    while (!queue.isEmpty()) {
      Pair<TreeNode, Integer> pair = queue.poll();
      TreeNode node = pair.first;
      int column = pair.second;
      minColumn = Math.min(minColumn, column);
      maxColumn = Math.max(maxColumn, column);
      colToValues.computeIfAbsent(column, x -> new ArrayList<>()).add(node.val);
      if (node.left != null) {
        queue.add(new Pair(node.left, column - 1));
      }
      if (node.right != null) {
        queue.add(new Pair(node.right, column + 1));
      }
    }

    for (int i = minColumn; i <= maxColumn; i++) {
      result.add(colToValues.get(i));
    }

    return result;
  }

  static class Pair<F, S> {
    F first;
    S second;

    Pair(F first, S second) {
      this.first = first;
      this.second = second;
    }
  }
}
