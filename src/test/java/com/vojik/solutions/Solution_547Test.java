package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_547Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(2,
        new Solution_547().findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(3,
        new Solution_547().findCircleNum(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
  }

}