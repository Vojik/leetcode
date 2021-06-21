package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_97Test {

  @Test
  public void test1_whenSolution1() {
    assertTrue(new Solution_97().isInterleave("aabcc", "dbbca", "aadbbcbcac"));
  }

  @Test
  public void test2_whenSolution1() {
    assertFalse(new Solution_97().isInterleave("aabcc", "dbbca", "aadbbbaccc"));
  }

  @Test
  public void test3_whenSolution1() {
    assertTrue(new Solution_97().isInterleave("", "", ""));
  }

  @Test
  public void test4_whenSolution1() {
    assertFalse(
        new Solution_97()
            .isInterleave(
                "abababababababababababababababababababababababababababababababababababababababababababababababababbb",
                "babababababababababababababababababababababababababababababababababababababababababababababababaaaba",
                "abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababbb"));
  }
}
