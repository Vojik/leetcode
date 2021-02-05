package com.vojik.solutions;

/**
 * 209. Minimum Size Subarray Sum
 */
public class Solution_209 {

  // Time: O(n) Space: O(1)
  public int minSubArrayLen(int target, int[] nums) {
    int min = Integer.MAX_VALUE;
    int sum = 0;
    for (int i = 0, j = 0; j < nums.length; j++) {
      if (sum + nums[j] >= target) {
        sum += nums[j];
        while (i <= j && sum >= target) {
          min = Math.min(min, j - i + 1);
          sum -= nums[i++];
        }
      } else {
        sum += nums[j];
      }
    }
    return min == Integer.MAX_VALUE ? 0 : min;
  }
}