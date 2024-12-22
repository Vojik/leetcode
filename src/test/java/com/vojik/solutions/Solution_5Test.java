package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_5Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals("bab", new Solution_5().longestPalindrome("babad"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals("bb", new Solution_5().longestPalindrome("cbbd"));
  }
}