package com.vojik.solutions;

/**
 * 42. Trapping Rain Water
 */
public class Solution_42 {

  public int trap(int[] height) {
    int maxSoFar = 0;
    int[] dp = new int[height.length];
    for (int i = 0; i < height.length; i++) {
      dp[i] = Math.max(0, maxSoFar - height[i]);
      maxSoFar = Math.max(maxSoFar, height[i]);
    }
    int ans = 0;
    maxSoFar = 0;
    for (int i = height.length - 1; i >= 0; i--) {
      int h = Math.max(0, maxSoFar - height[i]);
      ans += Math.min(dp[i], h);
      maxSoFar = Math.max(maxSoFar, height[i]);
    }
    return ans;
  }
}
