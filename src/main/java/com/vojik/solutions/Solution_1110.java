package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 1110. Delete Nodes And Return Forest
 */
public class Solution_1110 {

  private List<TreeNode> result;
  private Set<Integer> toDelete;

  public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
    result = new ArrayList<>();
    toDelete = new HashSet<>();
    for (int n : to_delete) {
      toDelete.add(n);
    }

    helper(root, true);
    return result;
  }

  private TreeNode helper(TreeNode node, boolean isRoot) {
    if (node == null) {
      return null;
    }

    boolean deleted = toDelete.contains(node.val);
    if (isRoot && !deleted) {
      result.add(node);
    }

    node.left = helper(node.left, deleted);
    node.right = helper(node.right, deleted);

    return deleted ? null : node;
  }
}
