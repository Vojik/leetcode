package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_2658Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(7, new Solution_2658().findMaxFish(
        new int[][] {{0, 2, 1, 0}, {4, 0, 0, 3}, {1, 0, 0, 4}, {0, 3, 2, 0}}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(1, new Solution_2658().findMaxFish(
        new int[][] {{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 1}}));
  }

}