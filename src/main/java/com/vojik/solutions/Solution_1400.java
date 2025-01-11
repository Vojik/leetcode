package com.vojik.solutions;

/**
 * 1400. Construct K Palindrome Strings
 */
public class Solution_1400 {

  public boolean canConstruct(String s, int k) {
    if (s.length() < k) {
      return false;
    }

    int[] counts = new int[26];
    for (char ch : s.toCharArray()) {
      counts[ch - 'a']++;
    }

    int numOdds = 0;
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] % 2 != 0) {
        numOdds++;
      }
    }
    return numOdds <= k;
  }
}
