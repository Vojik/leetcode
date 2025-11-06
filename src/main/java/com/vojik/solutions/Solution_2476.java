package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 2476. Closest Nodes Queries in a Binary Search Tree
 */
public class Solution_2476 {

  public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
    List<Integer> sortedValues = new ArrayList<>();
    dfs(root, sortedValues);
    List<List<Integer>> result = new ArrayList<>();
    for (int q : queries) {
      result.add(search(sortedValues, q));
    }
    return result;
  }

  private void dfs(TreeNode node, List<Integer> values) {
    if (node != null) {
      dfs(node.left, values);
      values.add(node.val);
      dfs(node.right, values);
    }
  }

  private List<Integer> search(List<Integer> sortedValues, int target) {
    int len = sortedValues.size();
    if (target < sortedValues.get(0)) {
      return List.of(-1, sortedValues.get(0));
    }
    if (target > sortedValues.get(len - 1)) {
      return List.of(sortedValues.get(len - 1), -1);
    }
    int left = 0;
    int right = len - 1;
    int ans = 0;
    while (left <= right) {
      int mid = (left + right) / 2;
      int curVal = sortedValues.get(mid);
      if (curVal == target) {
        return List.of(target, target);
      } else if (curVal > target) {
        right = mid - 1;
      } else {
        ans = mid;
        left = mid + 1;
      }
    }
    return List.of(sortedValues.get(ans), sortedValues.get(ans + 1));
  }
}
