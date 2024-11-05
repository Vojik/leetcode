package com.vojik.solutions;

/**
 * 2914. Minimum Number of Changes to Make Binary String Beautiful
 */
public class Solution_2914 {

  public int minChanges(String s) {
    int result = 0;
    for (int i = 1; i < s.length(); i += 2) {
      if (s.charAt(i) != s.charAt(i - 1)) {
        result++;
      }
    }
    return result;
  }
}
