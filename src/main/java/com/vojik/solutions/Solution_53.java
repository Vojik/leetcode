package com.vojik.solutions;

/**
 * 53. Maximum Subarray
 */
public class Solution_53 {

  public int maxSubArray(int[] nums) {
    int[] dp = new int[nums.length];
    dp[0] = nums[0];
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
      dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
      max = Math.max(max, dp[i]);
    }
    return max;
  }

  public int maxSubArray2(int[] nums) {
    int result = Integer.MIN_VALUE;
    int left = 0, right = 0;
    int curSum = 0;
    while (right < nums.length) {
      curSum += nums[right++];
      result = Math.max(curSum, result);

      while (left < right && curSum < 0) {
        curSum -= nums[left++];
      }
    }
    return result;
  }
}
