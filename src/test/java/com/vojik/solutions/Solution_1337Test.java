package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_1337Test {

  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(new int[]{1, 0},
        new Solution_1337().kWeakestRows(new int[][]{{1, 0}, {0, 0}, {1, 0}}, 2));
  }

  @Test
  public void test2_whenSolution1() {
    assertArrayEquals(new int[]{2, 0, 3},
        new Solution_1337().kWeakestRows(
            new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}}, 3));
  }

}