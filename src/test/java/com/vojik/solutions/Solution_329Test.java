package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_329Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(
        4, new Solution_329().longestIncreasingPath(new int[][] {{9, 9, 4}, {6, 6, 8}, {2, 1, 1}}));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(
        4, new Solution_329().longestIncreasingPath(new int[][] {{3, 4, 5}, {3, 2, 6}, {2, 2, 1}}));
  }
}
