package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_64Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(7, new Solution_64().minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(12, new Solution_64().minPathSum(new int[][]{{1, 2, 3}, {4, 5, 6}}));
  }
}