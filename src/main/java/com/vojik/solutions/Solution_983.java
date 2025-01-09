package com.vojik.solutions;

/**
 * 983. Minimum Cost For Tickets
 */
public class Solution_983 {

  public int mincostTickets(int[] days, int[] costs) {
    int lastDay = days[days.length - 1];
    int[] dp = new int[lastDay + 1];
    int cur = 0;
    for (int i = 1; i <= lastDay; i++) {
      if (i < days[cur]) {
        dp[i] = dp[i - 1];
      } else {
        dp[i] = Math.min(
            dp[i - 1] + costs[0],
            Math.min(
                dp[Math.max(0, i - 7)] + costs[1],
                dp[Math.max(0, i - 30)] + costs[2]
            )
        );
        cur++;
      }

    }
    return dp[lastDay];
  }
}
