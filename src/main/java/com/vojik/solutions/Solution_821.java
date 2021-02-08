package com.vojik.solutions;

/**
 * 821. Shortest Distance to a Character
 */
public class Solution_821 {

  // Time: O(n) Space: O(1)
  public int[] shortestToChar(String s, char c) {
    int[] result = new int[s.length()];
    int prev = Integer.MIN_VALUE;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == c) {
        prev = i;
      }
      result[i] = i - prev;
    }

    prev = Integer.MAX_VALUE;
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) == c) {
        prev = i;
      }
      if (result[i] < 0) {
        result[i] = prev - i;
      } else {
        result[i] = Math.min(prev - i, result[i]);
      }
    }
    return result;
  }
}
