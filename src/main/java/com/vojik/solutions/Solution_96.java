package com.vojik.solutions;

/** 96. Unique Binary Search Trees */
public class Solution_96 {

  public int numTrees(int n) {
    // F(0) = 1
    // F(1) = f(1,1) = d[0] * d[0] = 1
    // F(2) = f(1,2) + f(2,2) = d[0]*d[1] + d[1]*d[0] = 2
    // F(3) = f(1,3) + f(2,3) + f(3,3) = d[0]*d[2] + d[1]*d[1] + d[2]*d[0] = 2 + 1 + 2 = 5
    // F(4) = f(1,4) + f(2,4) + f(3,4) + f(4,4) = d[0]*d[3] + d[1]*d[2] + d[2]*d[1] + d[3]*d[0] = 5
    // + 2 + 2 + 5 = 14

    // F(i, n) = d[i - 1] * d[n - i]
    // F(3, 7) = d[2] * d[7 - 3] = d[2] * d[4] = ...

    int dp[] = new int[n + 1];
    dp[0] = 1;
    dp[1] = 1;

    for (int i = 2; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        dp[i] += dp[j - 1] * dp[i - j];
      }
    }
    return dp[n];
  }
}
