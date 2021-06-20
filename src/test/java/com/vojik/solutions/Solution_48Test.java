package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_48Test {
  @Test
  public void test1_whenSolution1() {
    int[][] input = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] expected = new int[][] {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
    new Solution_48().rotate(input);
    assertArrayEquals(expected, input);
  }

  @Test
  public void test2_whenSolution1() {
    int[][] input = new int[][] {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
    int[][] expected = new int[][] {{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}};
    new Solution_48().rotate(input);
    assertArrayEquals(expected, input);
  }
}
