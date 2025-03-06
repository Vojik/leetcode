package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_2639Test {

  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(new int[] {3},
        new Solution_2639().findColumnWidth(new int[][] {{1}, {22}, {333}}));
    assertArrayEquals(new int[] {3, 1, 2},
        new Solution_2639().findColumnWidth(new int[][] {{-15, 1, 3}, {15, 7, 12}, {5, 6, -2}}));
    assertArrayEquals(new int[] {2, 2, 2, 2, 2, 2, 2},
        new Solution_2639().findColumnWidth(
            new int[][] {{-4, 0, -1, 3, 9, 8, 6}, {-2, 5, -5, -7, -2, -6, 7},
                {4, -4, 1, 7, 0, 6, 8}, {-6, 2, -5, 0, 9, 1, -6}}));
    assertArrayEquals(new int[] {1},
        new Solution_2639().findColumnWidth(new int[][] {{0}}));
  }

}