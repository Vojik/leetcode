package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_562Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(
        3, new Solution_562().longestLine(new int[][] {{0, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(
        4, new Solution_562().longestLine(new int[][] {{1, 1, 1, 1}, {0, 1, 1, 0}, {0, 0, 0, 1}}));
  }

  @Test
  public void test1_whenSolution2() {
    assertEquals(
        3, new Solution_562().longestLine2(new int[][] {{0, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}}));
  }

  @Test
  public void test2_whenSolution2() {
    assertEquals(
        4, new Solution_562().longestLine2(new int[][] {{1, 1, 1, 1}, {0, 1, 1, 0}, {0, 0, 0, 1}}));
  }
}
