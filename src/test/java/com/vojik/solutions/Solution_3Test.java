package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_3Test {

  @Test
  public void tests_whenSolution1() {
    assertEquals(3, new Solution_3().lengthOfLongestSubstring("hello"));
    assertEquals(3, new Solution_3().lengthOfLongestSubstring("abcabcbb"));
    assertEquals(1, new Solution_3().lengthOfLongestSubstring("bbbbb"));
    assertEquals(3, new Solution_3().lengthOfLongestSubstring("pwwkew"));
    assertEquals(0, new Solution_3().lengthOfLongestSubstring(""));
    assertEquals(2, new Solution_3().lengthOfLongestSubstring("cdd"));
  }

  @Test
  public void tests_whenSolution2() {
    assertEquals(3, new Solution_3().lengthOfLongestSubstring2("hello"));
    assertEquals(3, new Solution_3().lengthOfLongestSubstring2("abcabcbb"));
    assertEquals(1, new Solution_3().lengthOfLongestSubstring2("bbbbb"));
    assertEquals(3, new Solution_3().lengthOfLongestSubstring2("pwwkew"));
    assertEquals(0, new Solution_3().lengthOfLongestSubstring2(""));
    assertEquals(2, new Solution_3().lengthOfLongestSubstring2("cdd"));
  }
}