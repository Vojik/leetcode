package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.HashMap;
import java.util.Map;

/**
 * 105. Construct Binary Tree from Preorder and Inorder Traversal
 */
public class Solution_105 {

  private int preorderIdx = 0;

  public TreeNode buildTree(int[] preorder, int[] inorder) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < inorder.length; i++) {
      map.put(inorder[i], i);
    }
    return preorderDfs(preorder, 0, inorder.length - 1, map);
  }

  private TreeNode preorderDfs(int[] preorder, int left, int right, Map<Integer, Integer> map) {
    if (left > right) {
      return null;
    }
    TreeNode root = new TreeNode(preorder[preorderIdx++]);
    root.left = preorderDfs(preorder, left, map.get(root.val) - 1, map);
    root.right = preorderDfs(preorder, map.get(root.val) + 1, right, map);
    return root;
  }
}