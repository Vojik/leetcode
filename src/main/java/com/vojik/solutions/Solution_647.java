package com.vojik.solutions;

/**
 * 647. Palindromic Substrings
 */
public class Solution_647 {

  // Time: O(n^2)
  // Space: O(1)
  public int countSubstrings(String s) {
    int result = 0, left = 0, right = 0;
    for (int i = 0; i < s.length() * 2 + 1; i++) {
      left = i / 2; // move left when i odd
      right = left + i % 2; // move right when i even
      while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
        result++;
        left--;
        right++;
      }
    }
    return result;
  }
}
