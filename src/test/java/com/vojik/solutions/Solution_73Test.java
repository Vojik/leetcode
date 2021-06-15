package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_73Test {

  @Test
  public void test1_whenSolution1() {
    int[][] input = new int[][] {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    int[][] expected = new int[][] {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
    new Solution_73().setZeroes(input);
    assertArrayEquals(expected, input);
  }
}
