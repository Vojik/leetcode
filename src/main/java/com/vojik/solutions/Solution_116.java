package com.vojik.solutions;


import com.vojik.helpers.TreeNode_116;

public class Solution_116 {

  public TreeNode_116 connect(TreeNode_116 root) {
    dfs(root, null);
    return root;
  }

  private void dfs(TreeNode_116 root, TreeNode_116 parent) {
    if (root == null) {
      return;
    }
    if (parent != null) {
      if (parent.right == root) {
        if (parent.next != null) {
          root.next = parent.next.left;
        }
      } else {
        root.next = parent.right;
      }
    }
    dfs(root.left, root);
    dfs(root.right, root);
  }
}
