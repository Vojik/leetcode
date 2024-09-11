package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1792Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(0.7833333333333333,
        new Solution_1792().maxAverageRatio(new int[][]{{1, 2}, {3, 5}, {2, 2}}, 2));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(0.5348484848484849,
        new Solution_1792().maxAverageRatio(new int[][]{{2, 4}, {3, 9}, {4, 5}, {2, 10}}, 4));
  }

}