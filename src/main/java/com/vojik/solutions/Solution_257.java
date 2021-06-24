package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.ArrayList;
import java.util.List;

/** 257. Binary Tree Paths */
public class Solution_257 {

  public List<String> binaryTreePaths(TreeNode root) {
    List<String> result = new ArrayList<>();
    binaryTreePaths(root, result, new StringBuilder());
    return result;
  }

  private void binaryTreePaths(TreeNode root, List<String> result, StringBuilder currentString) {
    if (root != null) {
      int len = currentString.length();
      if (len != 0) {
        currentString.append("->");
      }
      currentString.append(root.val);
      if (root.left == null && root.right == null) {
        result.add(currentString.toString());
      } else {
        binaryTreePaths(root.left, result, currentString);
        binaryTreePaths(root.right, result, currentString);
      }
      currentString.setLength(len);
    }
  }
}
