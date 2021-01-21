package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 95. Unique Binary Search Trees II
 */
public class Solution_95 {

  public List<TreeNode> generateTrees(int n) {
    return genTree(1, n);
  }

  private List<TreeNode> genTree(int start, int finish) {
    List<TreeNode> result = new ArrayList<>();

    if (start > finish) {
      result.add(null);
      return result;
    }

    for (int i = start; i <= finish; i++) {
      List<TreeNode> leftTree = genTree(start, i - 1);
      List<TreeNode> rightTree = genTree(i + 1, finish);

      for (TreeNode left : leftTree) {
        for (TreeNode right : rightTree) {
          TreeNode node = new TreeNode(i);
          node.left = left;
          node.right = right;
          result.add(node);
        }
      }
    }
    return result;
  }
}
