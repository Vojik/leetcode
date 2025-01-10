package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_63Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(2,
        new Solution_63().uniquePathsWithObstacles(new int[][] {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(1,
        new Solution_63().uniquePathsWithObstacles(new int[][] {{0, 1}, {0, 0}}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(0,
        new Solution_63().uniquePathsWithObstacles(new int[][] {{1, 0}}));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals(0,
        new Solution_63().uniquePathsWithObstacles(new int[][] {{0, 1, 0, 0}}));
  }

}