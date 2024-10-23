package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.HashMap;
import java.util.Map;

/**
 * 2641. Cousins in Binary Tree II
 */
public class Solution_2641 {

  public TreeNode replaceValueInTree(TreeNode root) {
    Map<Integer, Integer> levelSums = new HashMap<>();
    populateMap(root, levelSums, 1);
    replaceValues(root, levelSums, 1, 0);
    return root;
  }

  private void populateMap(TreeNode root, Map<Integer, Integer> levelSums, int level) {
    if (root == null) {
      return;
    }
    int currentSum = levelSums.getOrDefault(level, 0);
    levelSums.put(level, currentSum + root.val);
    populateMap(root.left, levelSums, level + 1);
    populateMap(root.right, levelSums, level + 1);
  }

  private void replaceValues(TreeNode root, Map<Integer, Integer> levelSums, int level,
      int newValue) {
    if (root == null) {
      return;
    }
    root.val = newValue;
    if (root.left != null || root.right != null) {
      int nextSum = levelSums.get(level + 1);
      if (root.left != null) {
        nextSum -= root.left.val;
      }
      if (root.right != null) {
        nextSum -= root.right.val;
      }
      replaceValues(root.left, levelSums, level + 1, nextSum);
      replaceValues(root.right, levelSums, level + 1, nextSum);
    }
  }
}
