package com.vojik.solutions;

/**
 * 256. Paint House
 */
public class Solution_256 {

  public int minCost(int[][] costs) {
    int len = costs.length;
    int[][] dp = new int[len][3];
    dp[0] = costs[0];
    for (int i = 1; i < len; i++) {
      dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + costs[i][0];
      dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + costs[i][1];
      dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + costs[i][2];
    }
    return Math.min(Math.min(dp[len - 1][0], dp[len - 1][1]), dp[len - 1][2]);
  }
}
