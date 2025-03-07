package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 366. Find Leaves of Binary Tree
 */
public class Solution_366 {

  // Time: O(n) Space: O(n)
  public List<List<Integer>> findLeaves(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    dfs(root, result);
    return result;
  }

  private int dfs(TreeNode node, List<List<Integer>> result) {
    if (node == null) {
      return -1;
    }
    int left = dfs(node.left, result);
    int right = dfs(node.right, result);
    int idx = Math.max(left, right) + 1;
    if (result.size() <= idx) {
      List<Integer> list = new ArrayList<>();
      list.add(node.val);
      result.add(list);
    } else {
      result.get(idx).add(node.val);
    }
    return idx;
  }
}
