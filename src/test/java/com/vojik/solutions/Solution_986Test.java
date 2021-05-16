package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_986Test {

  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(
        new int[][] {{1, 2}, {5, 5}, {8, 10}, {15, 23}, {24, 24}, {25, 25}},
        new Solution_986()
            .intervalIntersection(
                new int[][] {{0, 2}, {5, 10}, {13, 23}, {24, 25}},
                new int[][] {{1, 5}, {8, 12}, {15, 24}, {25, 26}}));
  }

  @Test
  public void test2_whenSolution1() {
    assertArrayEquals(
        new int[][] {},
        new Solution_986().intervalIntersection(new int[][] {{1, 3}, {5, 9}}, new int[][] {}));
  }

  @Test
  public void test3_whenSolution1() {
    assertArrayEquals(
        new int[][] {},
        new Solution_986().intervalIntersection(new int[][] {}, new int[][] {{4, 8}, {10, 12}}));
  }

  @Test
  public void test4_whenSolution1() {
    assertArrayEquals(
        new int[][] {},
        new Solution_986().intervalIntersection(new int[][] {{1, 7}}, new int[][] {{3, 10}}));
  }
}
