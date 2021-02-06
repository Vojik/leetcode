package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

/**
 * 108. Convert Sorted Array to Binary Search Tree
 */
public class Solution_108 {

  public TreeNode sortedArrayToBST(int[] nums) {
    return helper(nums, 0, nums.length - 1);
  }


  private TreeNode helper(int[] nums, int start, int end) {
    if (end - start < 0) {
      return null;
    }
    if (end - start == 0) {
      return new TreeNode(nums[start]);
    }

    int rootIdx = start + (end - start) / 2;
    return new TreeNode(nums[rootIdx], helper(nums, start, rootIdx - 1),
        helper(nums, rootIdx + 1, end));
  }

}
