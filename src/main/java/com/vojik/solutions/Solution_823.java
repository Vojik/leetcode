package com.vojik.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 823. Binary Trees With Factors
 */
public class Solution_823 {

  // Time: O(n^2)
  // Space: O(N)
  public int numFactoredBinaryTrees(int[] arr) {
    int MOD = 1_000_000_007;
    Arrays.sort(arr);

    long[] dp = new long[arr.length];
    Arrays.fill(dp, 1);

    Map<Integer, Integer> indexes = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      indexes.put(arr[i], i);
    }

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < i; j++) {
        if (arr[i] % arr[j] == 0) {
          Integer idx = indexes.get(arr[i] / arr[j]);
          if (idx != null) {
            dp[i] += dp[j] * dp[idx];
          }
        }
      }
    }

    long ans = 0;
    for (int i = 0; i < dp.length; i++) {
      ans += dp[i] % MOD;
    }

    return (int) (ans % MOD);
  }
}
