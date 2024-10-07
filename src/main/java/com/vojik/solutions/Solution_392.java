package com.vojik.solutions;

/**
 * 392. Is Subsequence
 */
public class Solution_392 {

  public boolean isSubsequence(String s, String t) {
    int sCur = 0;
    int tCur = 0;
    while (sCur < s.length() && tCur < t.length()) {
      if (s.charAt(sCur) == t.charAt(tCur)) {
        sCur++;
      }
      tCur++;
    }

    return sCur == s.length();
  }
}
