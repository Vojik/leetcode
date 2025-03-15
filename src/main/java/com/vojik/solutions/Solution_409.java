package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 409. Longest Palindrome
 */
public class Solution_409 {

  // Time: O(n)
  // Space: O(1)
  public int longestPalindrome(String s) {
    Map<Character, Integer> freq = new HashMap<>();
    for (char ch : s.toCharArray()) {
      freq.put(ch, freq.getOrDefault(ch, 0) + 1);
    }

    int pairs = 0;
    int singles = 0;
    for (Integer v : freq.values()) {
      pairs += v / 2;
      singles += v % 2;
    }
    return pairs * 2 + (singles > 0 ? 1 : 0);
  }
}
