package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

public class Solution_1379 {

  public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
    if (original == null) return null;
    if (original == target) return cloned;
    TreeNode left = getTargetCopy(original.left, cloned.left, target);
    if (left != null) return left;
    return getTargetCopy(original.right, cloned.right, target);
  }
}
