package com.vojik.solutions;

/** 300. Longest Increasing Subsequence */
public class Solution_300 {

  public int lengthOfLIS(int[] nums) {
    int[] dp = new int[nums.length];
    dp[0] = 1;
    int ans = 1;
    for (int i = 1; i < nums.length; i++) {
      int maxLocal = 1;
      for (int j = 0; j < i; j++) {
        if (nums[j] < nums[i]) {
          maxLocal = Math.max(maxLocal, 1 + dp[j]);
        }
      }
      dp[i] = maxLocal;
      ans = Math.max(ans, dp[i]);
    }
    return ans;
  }
}
