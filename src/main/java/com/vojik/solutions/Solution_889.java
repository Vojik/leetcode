package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/**
 * 889. Construct Binary Tree from Preorder and Postorder Traversal
 */
public class Solution_889 {

  private int p1 = 0;
  private int p2 = 0;

  // Time: O(n)
  // Space: O(n)
  public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
    TreeNode root = new TreeNode(preorder[p1++]);

    if (root.val != postorder[p2]) {
      root.left = constructFromPrePost(preorder, postorder);
    }

    if (root.val != postorder[p2]) {
      root.right = constructFromPrePost(preorder, postorder);
    }

    p2++;
    return root;
  }
}
