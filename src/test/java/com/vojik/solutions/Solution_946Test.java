package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_946Test {

  @Test
  public void test1_whenSolution1() {
    assertTrue(new Solution_946()
        .validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
  }

  @Test
  public void test2_whenSolution1() {
    assertFalse(new Solution_946()
        .validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 3, 5, 1, 2}));
  }

  @Test
  public void test1_whenSolution2() {
    assertTrue(new Solution_946()
        .validateStackSequences2(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
  }

  @Test
  public void test2_whenSolution2() {
    assertFalse(new Solution_946()
        .validateStackSequences2(new int[]{1, 2, 3, 4, 5}, new int[]{4, 3, 5, 1, 2}));
  }
}