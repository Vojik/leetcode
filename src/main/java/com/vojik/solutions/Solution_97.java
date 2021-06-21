package com.vojik.solutions;

/** 97. Interleaving String */
public class Solution_97 {

  public boolean isInterleave(String s1, String s2, String s3) {
    if (s1.length() + s2.length() != s3.length()) {
      return false;
    }
    int memo[][] = new int[s1.length() + 1][s2.length() + 1];
    for (int i = 0; i <= s1.length(); i++) {
      for (int j = 0; j <= s2.length(); j++) {
        memo[i][j] = -1;
      }
    }
    return isInterleave(s1, 0, s2, 0, s3, 0, memo);
  }

  private boolean isInterleave(
      String s1, int p1, String s2, int p2, String s3, int p3, int[][] memo) {
    if (p1 == s1.length() && p2 == s2.length() && p3 == s3.length()) {
      return true;
    }
    if (p1 >= s1.length() && p2 >= s2.length() && p3 < s3.length()) {
      return false;
    }
    if (memo[p1][p2] >= 0) {
      return memo[p1][p2] == 1;
    }

    boolean ans =
        (p1 < s1.length()
                && s1.charAt(p1) == s3.charAt(p3)
                && isInterleave(s1, p1 + 1, s2, p2, s3, p3 + 1, memo))
            || (p2 < s2.length()
                && s2.charAt(p2) == s3.charAt(p3)
                && isInterleave(s1, p1, s2, p2 + 1, s3, p3 + 1, memo));
    memo[p1][p2] = ans ? 1 : 0;
    return ans;
  }
}
