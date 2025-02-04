package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_256Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(10,
        new Solution_256().minCost(new int[][] {{17, 2, 17}, {16, 16, 5}, {14, 3, 19}}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(2,
        new Solution_256().minCost(new int[][] {{7, 6, 2}}));
  }
}