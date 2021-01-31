package com.vojik.solutions;

public class Solution_1641 {

  private static final char[] VOWELS = new char[]{'a','e','i','o','u'};

  public int countVowelStringsBacktracking(int n) {
    return countVowelStringsBacktracking(n, "", 0);
  }

  private int countVowelStringsBacktracking(int n, String str, int start) {
    if (n == str.length()) {
      return 1;
    }

    int res = 0;
    for (int i = start; i < VOWELS.length; i++) {
      res += countVowelStringsBacktracking(n, str + VOWELS[i], i);
    }
    return res;
  }

  public int countVowelStringsBacktrackingOptimized(int n) {
    return countVowelStringsBacktrackingOptimized(n, 0);
  }

  private int countVowelStringsBacktrackingOptimized(int n, int start) {
    if (n == 0) {
      return 1;
    }

    int res = 0;
    for (int i = start; i < 5; i++) {
      res += countVowelStringsBacktrackingOptimized(n -1, i);
    }
    return res;
  }
}
