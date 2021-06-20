package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/** 226. Invert Binary Tree */
public class Solution_226 {

  public TreeNode invertTree(TreeNode node) {
    if (node == null) {
      return node;
    }
    TreeNode temp = node.left;
    node.left = node.right;
    node.right = temp;
    invertTree(node.left);
    invertTree(node.right);
    return node;
  }
}
