package com.vojik.solutions;

import java.util.Arrays;

/**
 * 1877. Minimize Maximum Pair Sum in Array
 */
class Solution_1877 {

  public int minPairSum(int[] nums) {
    Arrays.sort(nums);
    int l = 0;
    int r = nums.length - 1;
    int maxSum = 0;
    while (l < r) {
      maxSum = Math.max(maxSum, nums[l++] + nums[r--]);
    }
    return maxSum;
  }
}
