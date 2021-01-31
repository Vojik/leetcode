package com.vojik.solutions;

public class Solution_1641 {

  private static final char[] VOWELS = new char[]{'a','e','i','o','u'};

  public int countVowelStrings(int n) {
    return countVowelStrings(n, "", 0);
  }

  private int countVowelStrings(int n, String str, int start) {
    if (n == str.length()) {
      return 1;
    }

    int res = 0;
    for (int i = start; i < VOWELS.length; i++) {
      res += countVowelStrings(n, str + VOWELS[i], i);
    }
    return res;
  }
}
