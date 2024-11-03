package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_2490Test {

  @Test
  public void testTrue_whenSolution1() {
    assertTrue(new Solution_2490().isCircularSentence("leetcode exercises sound delightful"));
    assertTrue(new Solution_2490().isCircularSentence("eetcode"));
    assertTrue(new Solution_2490().isCircularSentence("leetcode eats soul"));
  }

  @Test
  public void testFalse_whenSolution1() {
    assertFalse(new Solution_2490().isCircularSentence("Leetcode is cool"));
    assertFalse(new Solution_2490().isCircularSentence("happy Leetcode"));
    assertFalse(new Solution_2490().isCircularSentence("Leetcode"));
    assertFalse(new Solution_2490().isCircularSentence("I like Leetcode"));
  }

}