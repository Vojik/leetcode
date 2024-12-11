package com.vojik.solutions;

/**
 * 643. Maximum Average Subarray I
 */
public class Solution_643 {
  // Time: O(n)
  // Space: O(1)
  public double findMaxAverage(int[] nums, int k) {
    double sum = 0;
    double result = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if (i >= k) {
        sum -= nums[i - k];
      }
      if (i + 1 >= k) {
        result = Math.max(result, sum / k);
      }
    }
    return result;
  }
}
