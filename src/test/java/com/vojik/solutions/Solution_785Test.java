package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_785Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertFalse(
        new Solution_785().isBipartite(new int[][]{{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}}));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertTrue(
        new Solution_785().isBipartite(new int[][]{{1, 3}, {0, 2}, {1, 3}, {0, 2}}));
  }

}