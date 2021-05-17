package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_680Test {

  @Test
  public void test1_whenSolution1() {
    assertTrue(new Solution_680().validPalindrome("aba"));
  }

  @Test
  public void test2_whenSolution1() {
    assertTrue(new Solution_680().validPalindrome("abca"));
  }

  @Test
  public void test3_whenSolution1() {
    assertFalse(new Solution_680().validPalindrome("abc"));
  }
}
