package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.ArrayList;
import java.util.List;

/** 113. Path Sum II */
public class Solution_113 {

  public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    List<List<Integer>> result = new ArrayList<>();
    dfs(root, targetSum, new ArrayList<>(), result);
    return result;
  }

  private void dfs(TreeNode root, int sum, List<Integer> currentList, List<List<Integer>> result) {
    if (root != null) {
      currentList.add(root.val);
      int newSum = sum - root.val;
      if (root.left == null && root.right == null) {
        if (newSum == 0) {
          result.add(new ArrayList<>(currentList));
        }
      }
      dfs(root.left, newSum, currentList, result);
      dfs(root.right, newSum, currentList, result);
      currentList.remove(currentList.size() - 1);
    }
  }
}
