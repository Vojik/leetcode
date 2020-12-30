package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Solution_494Test {

  @Test
  public void test1_whenSolution() {
    Solution_494 solution = new Solution_494();
    assertEquals(5, solution.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
  }

  @Test
  public void test2_whenSolution() {
    Solution_494 solution = new Solution_494();
    assertEquals(5844, solution.findTargetSumWays(
        new int[]{43, 9, 26, 24, 39, 40, 20, 11, 18, 13, 14, 30, 48, 47, 37, 24, 32, 32, 2, 26},
        47));
  }

  @Test
  public void test3_whenSolution() {
    Solution_494 solution = new Solution_494();
    assertEquals(7268, solution.findTargetSumWays(
        new int[]{49, 19, 9, 12, 16, 21, 7, 5, 32, 50, 31, 40, 14, 15, 1, 8, 33, 5, 9, 26},
        12));
  }

  //////////////////////////////////////////////////////

  @Test
  public void test1_whenSolution2() {
    Solution_494 solution = new Solution_494();
    assertEquals(5, solution.findTargetSumWays2(new int[]{1, 1, 1, 1, 1}, 3));
  }

  @Test
  public void test2_whenSolution2() {
    Solution_494 solution = new Solution_494();
    assertEquals(5844, solution.findTargetSumWays2(
        new int[]{43, 9, 26, 24, 39, 40, 20, 11, 18, 13, 14, 30, 48, 47, 37, 24, 32, 32, 2, 26},
        47));
  }

  @Test
  public void test3_whenSolution2() {
    Solution_494 solution = new Solution_494();
    assertEquals(7268, solution.findTargetSumWays2(
        new int[]{49, 19, 9, 12, 16, 21, 7, 5, 32, 50, 31, 40, 14, 15, 1, 8, 33, 5, 9, 26},
        12));
  }

}