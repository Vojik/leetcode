package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_74Test {

  @Test
  public void test_whenSolution1() {
    assertTrue(new Solution_74().searchMatrix(
        new int[][] {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));
    assertTrue(new Solution_74().searchMatrix(
        new int[][] {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 11));
    assertFalse(new Solution_74().searchMatrix(
        new int[][] {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 13));
    assertTrue(new Solution_74().searchMatrix(new int[][] {{1}}, 1));
    assertTrue(new Solution_74().searchMatrix(new int[][] {{1}, {3}, {5}}, 3));
    assertTrue(new Solution_74().searchMatrix(new int[][] {{1}, {3}}, 3));
  }
}