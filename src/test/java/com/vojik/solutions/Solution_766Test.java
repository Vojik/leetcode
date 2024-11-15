package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_766Test {

  @Test
  public void test1_whenSolution1() {
    assertTrue(
        new Solution_766().isToeplitzMatrix(new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}}));
  }

  @Test
  public void test2_whenSolution1() {
    assertFalse(
        new Solution_766().isToeplitzMatrix(new int[][]{{1, 2}, {2, 2}}));
  }
}