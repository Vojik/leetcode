package com.vojik.solutions;

/**
 * 2419. Longest Subarray With Maximum Bitwise AND
 */
public class Solution_2419 {

  public int longestSubarray(int[] nums) {
    int max = Integer.MIN_VALUE;
    for (int n : nums) {
      max = Math.max(max, n);
    }

    int result = 0;
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == max) {
        count++;
        result = Math.max(result, count);
      } else {
        count = 0;
      }
    }
    return result;
  }
}
