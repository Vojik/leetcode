package com.vojik.solutions;

/**
 * 703. Kth Largest Element in a Stream
 */
public class Solution_703 {

  int k;
  TreeNode root;

  public Solution_703(int k, int[] nums) {
    this.k = k;
    for (int i = 0; i < nums.length; i++) {
      this.root = insert(this.root, nums[i]);
    }
  }

  public int add(int val) {
    this.root = insert(this.root, val);
    return search(this.root, this.k);
  }

  private TreeNode insert(TreeNode node, int val) {
    if (node == null) {
      return new TreeNode(val);
    }
    if (node.val > val) {
      node.left = insert(node.left, val);
    } else {
      node.right = insert(node.right, val);
    }
    node.subTreeCount++;
    return node;
  }

  private int search(TreeNode node, int k) {
    int rightSubTreeCount = node.right != null ? node.right.subTreeCount : 0;
    if (k == rightSubTreeCount + 1) {
      return node.val;
    } else if (k > rightSubTreeCount) {
      return search(node.left, k - rightSubTreeCount - 1);
    } else {
      return search(node.right, k);
    }
  }

  static class TreeNode {
    int val;
    int subTreeCount = 1;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
      this.val = val;
    }
  }
}