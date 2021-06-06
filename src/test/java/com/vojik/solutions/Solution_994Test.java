package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_994Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(
        4, new Solution_994().orangesRotting(new int[][] {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(
        -1, new Solution_994().orangesRotting(new int[][] {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}}));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertEquals(0, new Solution_994().orangesRotting(new int[][] {{0, 2}}));
  }
}
