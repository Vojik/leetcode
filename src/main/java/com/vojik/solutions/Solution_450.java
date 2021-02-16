package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/**
 * 450. Delete Node in a BST
 */
public class Solution_450 {

  public TreeNode deleteNode(TreeNode root, int key) {
    if (root == null) {
      return null;
    }
    if (key < root.val) {
      root.left = deleteNode(root.left, key);
    } else if (key > root.val) {
      root.right = deleteNode(root.right, key);
    } else {
      if (root.left == null) {
        return root.right;
      } else if (root.right == null) {
        return root.left;
      }

      TreeNode last = root.right;
      while (last.left != null) {
        last = last.left;
      }
      root.val = last.val;
      root.right = deleteNode(root.right, root.val);
    }
    return root;
  }
}
