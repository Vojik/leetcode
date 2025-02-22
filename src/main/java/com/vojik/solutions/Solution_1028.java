package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/**
 * 1028. Recover a Tree From Preorder Traversal
 */
public class Solution_1028 {


  private int i;

  // Time: O(n) Memory: O(n)
  public TreeNode recoverFromPreorder(String traversal) {
    i = 0;
    return dfs(traversal, 0);
  }

  private TreeNode dfs(String str, int expectedLevel) {
    if (i == str.length()) {
      return null;
    }
    int currentLevel = 0;
    while (i + currentLevel < str.length() && str.charAt(i + currentLevel) == '-') {
      currentLevel++;
    }

    if (currentLevel != expectedLevel) {
      return null;
    }

    i += currentLevel;
    int num = 0;
    while (i < str.length() && Character.isDigit(str.charAt(i))) {
      num = num * 10 + str.charAt(i) - '0';
      i++;
    }

    TreeNode node = new TreeNode(num);
    node.left = dfs(str, expectedLevel + 1);
    node.right = dfs(str, expectedLevel + 1);

    return node;
  }
}
