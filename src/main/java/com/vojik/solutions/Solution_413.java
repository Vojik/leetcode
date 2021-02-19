package com.vojik.solutions;

/**
 * 413. Arithmetic Slices
 */
public class Solution_413 {

  // Time: O (n^2) Space: O(1)
  public int numberOfArithmeticSlices(int[] A) {
    int ans = 0;
    for (int i = 0; i <= A.length - 3; i++) {
      int diff = A[i + 1] - A[i];
      for (int j = i + 2; j < A.length; j++) {
        if (A[j] - A[j - 1] == diff) {
          ans++;
        } else {
          break;
        }
      }
    }
    return ans;
  }

  // Time: O (n) Space: O(n)
  public int numberOfArithmeticSlicesDP(int[] A) {
    int ans = 0;
    int[] dp = new int[A.length];
    dp[0] = 0;
    dp[1] = 0;
    for (int i = 2; i < A.length; i++) {
      if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
        dp[i] = dp[i - 1] + 1;
        ans += dp[i];
      } else {
        dp[i] = 0;
      }
    }
    return ans;
  }

  // Time: O(n) Space: O(1)
  public int numberOfArithmeticSlicesDPOptimized(int[] A) {
    int ans = 0;
    int prev = 0;
    int cur = 0;
    for (int i = 2; i < A.length; i++) {
      if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
        cur = prev + 1;
        ans += cur;
        prev = cur;
      } else {
        prev = 0;
      }
    }
    return ans;
  }
}