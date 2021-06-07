package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_210Test {

  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(new int[] {0, 1}, new Solution_210().findOrder(2, new int[][] {{1, 0}}));
  }

  @Test
  public void test2_whenSolution1() {
    assertArrayEquals(
        new int[] {0, 1, 2, 3},
        new Solution_210().findOrder(4, new int[][] {{1, 0}, {2, 0}, {3, 1}, {3, 2}}));
  }
}
