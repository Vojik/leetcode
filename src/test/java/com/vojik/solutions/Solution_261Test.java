package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_261Test {

  @Test
  public void test_whenSolution1() {
    assertTrue(new Solution_261().validTree(5, new int[][] {{0, 1}, {0, 2}, {0, 3}, {1, 4}}));
    assertFalse(
        new Solution_261().validTree(5, new int[][] {{0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}}));
  }

}