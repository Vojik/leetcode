package com.vojik.solutions;

/**
 * 1422. Maximum Score After Splitting a String
 */
public class Solution_1422 {

  // Time: O(n) Space: O(n)
  public int maxScore(String s) {
    int maxScore = 0;
    int len = s.length();
    int[] ar = new int[len + 1];
    for (int i = len - 1; i >= 0; --i) {
      int val = s.charAt(i) == '1' ? 1 : 0;
      ar[i] = ar[i + 1] + val;
    }
    int leftSum = 0;
    for (int i = 0; i < len - 1; i++) {
      leftSum += s.charAt(i) == '0' ? 1 : 0;
      maxScore = Math.max(maxScore, leftSum + ar[i + 1]);
    }
    return maxScore;
  }

  // Time: O(n) Space: O(1)
  public int maxScore2(String s) {
    int maxScore = 0;
    int rightPrefixSum = 0;

    for (int i = s.length() - 1; i > 0; --i) {
      rightPrefixSum += s.charAt(i) == '1' ? 1 : 0;
    }

    int leftPrefixSum = 0;
    for (int i = 0; i < s.length() - 1; ++i) {
      leftPrefixSum += s.charAt(i) == '0' ? 1 : 0;
      if (i > 0) {
        rightPrefixSum -= s.charAt(i) == '1' ? 1 : 0;
      }
      maxScore = Math.max(maxScore, leftPrefixSum + rightPrefixSum);
    }
    return maxScore;
  }
}
