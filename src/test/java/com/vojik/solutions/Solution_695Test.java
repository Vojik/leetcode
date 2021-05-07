package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_695Test {

  @Test
  public void test1_whenSolution1() {
    int[][] grid =
        new int[][] {
          {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
          {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
          {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
          {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
          {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
          {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
          {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
    Assertions.assertEquals(6, new Solution_695().maxAreaOfIsland(grid));
  }

  @Test
  public void test1_whenSolution2() {
    int[][] grid =
        new int[][] {
            {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
            {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
            {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
    Assertions.assertEquals(6, new Solution_695().maxAreaOfIsland2(grid));
  }
}
