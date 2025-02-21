package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.HashSet;
import java.util.Set;

/**
 * 1261. Find Elements in a Contaminated Binary Tree
 */
public class Solution_1261 {

  private Set<Integer> set = new HashSet<>();

  public Solution_1261(TreeNode root) {
    dfs(root, 0);
  }

  private void dfs(TreeNode node, int curVal) {
    set.add(curVal);
    if (node.left != null) {
      dfs(node.left, 2 * curVal + 1);
    }
    if (node.right != null) {
      dfs(node.right, 2 * curVal + 2);
    }
  }

  public boolean find(int target) {
    return set.contains(target);
  }
}
