package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_1331Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertArrayEquals(new int[]{4, 1, 2, 3},
        new Solution_1331().arrayRankTransform(new int[]{40, 10, 20, 30}));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertArrayEquals(new int[]{1, 1, 1},
        new Solution_1331().arrayRankTransform(new int[]{100, 100, 100}));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertArrayEquals(new int[]{5, 3, 4, 2, 8, 6, 7, 1, 3},
        new Solution_1331().arrayRankTransform(new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12}));
  }

}