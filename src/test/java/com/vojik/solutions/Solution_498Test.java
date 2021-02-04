package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_498Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertArrayEquals(new int[]{1, 2, 4, 7, 5, 3, 6, 8, 9},
        new Solution_498().findDiagonalOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
  }

}