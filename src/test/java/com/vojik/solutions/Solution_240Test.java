package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_240Test {

  @Test
  public void test1_whenSolution1() {
    int[][] input = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22},
        {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
    assertTrue(new Solution_240().searchMatrix(input, 5));
  }

  @Test
  public void test2_whenSolution1() {
    int[][] input = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22},
        {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
    assertFalse(new Solution_240().searchMatrix(input, 20));
  }

  @Test
  public void test3_whenSolution1() {
    int[][] input = new int[][]{{1}, {3}, {5}};
    assertFalse(new Solution_240().searchMatrix(input, 0));
  }

  ////////////////////////////////////

  @Test
  public void test1_whenSolution2() {
    int[][] input = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22},
        {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
    assertTrue(new Solution_240().searchMatrixRecursively(input, 5));
  }

  @Test
  public void test2_whenSolution2() {
    int[][] input = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22},
        {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
    assertFalse(new Solution_240().searchMatrixRecursively(input, 20));
  }

  @Test
  public void test3_whenSolution2() {
    int[][] input = new int[][]{{1}, {3}, {5}};
    assertFalse(new Solution_240().searchMatrixRecursively(input, 0));
  }
}