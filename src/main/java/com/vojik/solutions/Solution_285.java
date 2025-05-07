package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/**
 * 285. Inorder Successor in BST
 */
public class Solution_285 {

  public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
    return inorderSuccessorFromParent(root, p, null);
  }

  private TreeNode inorderSuccessorFromParent(TreeNode node, TreeNode target, TreeNode parent) {
    if (node == null) {
      return null;
    }
    if (node.val == target.val) {
      if (node.right == null) {
        return parent;
      }
      node = node.right;
      while (node != null && node.left != null) {
        node = node.left;
      }
      return node;
    }
    if (node.val > target.val) {
      return inorderSuccessorFromParent(node.left, target, node);
    } else {
      return inorderSuccessorFromParent(node.right, target, parent);
    }
  }
}
