package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_1834Test {

  @Test
  public void test_whenSolution1() {
    assertArrayEquals(new int[] {0, 2, 3, 1},
        new Solution_1834().getOrder(new int[][] {{1, 2}, {2, 4}, {3, 2}, {4, 1}}));

    assertArrayEquals(new int[] {4, 3, 2, 0, 1},
        new Solution_1834().getOrder(new int[][] {{7, 10}, {7, 12}, {7, 5}, {7, 4}, {7, 2}}));

    assertArrayEquals(new int[] {6, 1, 2, 9, 4, 10, 0, 11, 5, 13, 3, 8, 12, 7},
        new Solution_1834().getOrder(
            new int[][] {{19, 13}, {16, 9}, {21, 10}, {32, 25}, {37, 4}, {49, 24}, {2, 15},
                {38, 41}, {37, 34}, {33, 6}, {45, 4}, {18, 18}, {46, 39}, {12, 24}}));

    assertArrayEquals(new int[] {14, 5, 12, 3, 0, 13, 10, 11, 9, 6, 4, 15, 8, 1, 17, 2, 7, 16},
        new Solution_1834().getOrder(
            new int[][] {{46, 9}, {46, 42}, {30, 46}, {30, 13}, {30, 24}, {30, 5}, {30, 21},
                {29, 46}, {29, 41}, {29, 18}, {29, 16}, {29, 17}, {29, 5}, {22, 15}, {22, 13},
                {22, 25}, {22, 49}, {22, 44}}));

  }

}