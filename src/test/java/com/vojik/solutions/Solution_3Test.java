package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_3Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(3, new Solution_3().lengthOfLongestSubstring("hello"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(3, new Solution_3().lengthOfLongestSubstring("abcabcbb"));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(1, new Solution_3().lengthOfLongestSubstring("bbbbb"));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals(3, new Solution_3().lengthOfLongestSubstring("pwwkew"));
  }

  @Test
  public void test5_whenSolution1() {
    assertEquals(0, new Solution_3().lengthOfLongestSubstring(""));
  }

  @Test
  public void test6_whenSolution1() {
    assertEquals(2, new Solution_3().lengthOfLongestSubstring("cdd"));
  }
}