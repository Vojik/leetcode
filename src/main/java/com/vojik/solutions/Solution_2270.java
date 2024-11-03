package com.vojik.solutions;

/**
 * 2270. Number of Ways to Split Array
 */
public class Solution_2270 {

  // Time: O(n)
  // Space: O(1)
  public int waysToSplitArray(int[] nums) {
    long prefixSum = 0;
    for (int num : nums) {
      prefixSum += num;
    }

    int result = 0;
    long leftSum = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      leftSum += nums[i];
      if (leftSum >= prefixSum - leftSum) {
        result++;
      }
    }
    return result;
  }

}
