package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_1971Test {

  @Test
  public void test1_whenSolution1() {
    assertTrue(new Solution_1971().validPath(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}, 0, 2));
  }

  @Test
  public void test2_whenSolution1() {
    assertFalse(
        new Solution_1971().validPath(6, new int[][] {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}}, 0,
            5));
  }

}