package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_2570Test {

  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(new int[][] {{1, 6}, {2, 3}, {3, 2}, {4, 6}},
        new Solution_2570().mergeArrays(new int[][] {{1, 2}, {2, 3}, {4, 5}},
            new int[][] {{1, 4}, {3, 2}, {4, 1}}));
    assertArrayEquals(new int[][] {{1, 3}, {2, 4}, {3, 6}, {4, 3}, {5, 5}},
        new Solution_2570().mergeArrays(new int[][] {{2, 4}, {3, 6}, {5, 5}},
            new int[][] {{1, 3}, {4, 3}}));
  }

}