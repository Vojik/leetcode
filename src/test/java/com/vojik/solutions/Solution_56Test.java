package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_56Test {

  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}},
        new Solution_56().merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
  }

  @Test
  public void test2_whenSolution1() {
    assertArrayEquals(new int[][]{{1, 5}}, new Solution_56().merge(new int[][]{{1, 4}, {4, 5}}));
  }

}