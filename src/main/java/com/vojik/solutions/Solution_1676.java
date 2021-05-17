package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.HashSet;
import java.util.Set;

/** 1676. Lowest Common Ancestor of a Binary Tree IV */
public class Solution_1676 {

  private TreeNode commonAncestor;
  private int count = 0;

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode[] nodes) {
    Set<TreeNode> set = new HashSet<>();
    for (TreeNode n : nodes) {
      set.add(n);
    }
    lowestCommonAncestor(root, set);
    return commonAncestor;
  }

  private int lowestCommonAncestor(TreeNode root, Set<TreeNode> nodes) {
    if (root == null) {
      return 0;
    }

    int left = lowestCommonAncestor(root.left, nodes);

    int right = lowestCommonAncestor(root.right, nodes);

    int mid = nodes.contains(root) ? 1 : 0;

    if (commonAncestor == null && left + right + mid == nodes.size()) {
      this.commonAncestor = root;
    }

    return left + right + mid;
  }
}
