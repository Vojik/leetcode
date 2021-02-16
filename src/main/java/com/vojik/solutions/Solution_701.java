package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/**
 * 701. Insert into a Binary Search Tree
 */
public class Solution_701 {

  // Time: O(logN) Space: O(h)
  public TreeNode insertIntoBST(TreeNode root, int val) {
    if (root == null) {
      return new TreeNode(val);
    }
    TreeNode node = root;
    insert(node, val);
    return root;
  }

  private void insert(TreeNode root, int val) {
    if (root.val > val) {
      if (root.left != null) {
        insert(root.left, val);
      } else {
        root.left = new TreeNode(val);
      }
    } else {
      if (root.right != null) {
        insert(root.right, val);
      } else {
        root.right = new TreeNode(val);
      }
    }
  }
}
