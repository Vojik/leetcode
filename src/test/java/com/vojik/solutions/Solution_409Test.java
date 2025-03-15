package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_409Test {

  @Test
  public void test_whenSolution1() {
    assertEquals(7, new Solution_409().longestPalindrome("abccccdd"));
    assertEquals(1, new Solution_409().longestPalindrome("a"));
  }

}