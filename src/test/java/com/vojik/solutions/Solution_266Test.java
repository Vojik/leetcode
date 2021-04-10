package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_266Test {

  @Test
  public void test1_whenSolution1() {
    assertFalse(new Solution_266().canPermutePalindrome("code"));
  }

  @Test
  public void test2_whenSolution1() {
    assertTrue(new Solution_266().canPermutePalindrome("aab"));
  }

  @Test
  public void test3_whenSolution1() {
    assertTrue(new Solution_266().canPermutePalindrome("carerac"));
  }

}