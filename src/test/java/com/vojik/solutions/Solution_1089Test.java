package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_1089Test {

  @Test
  public void test1_whenSolution1() {
    Solution_1089 solution = new Solution_1089();
    int[] input = {1, 0, 2, 3, 0, 4, 5, 0};
    solution.duplicateZeros(input);
    assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0, 4}, input);
  }

  @Test
  public void test2_whenSolution1() {
    Solution_1089 solution = new Solution_1089();
    int[] input = {1,2,3};
    solution.duplicateZeros(input);
    assertArrayEquals(new int[]{1, 2,3}, input);
  }

  @Test
  public void test3_whenSolution1() {
    Solution_1089 solution = new Solution_1089();
    int[] input = {0};
    solution.duplicateZeros(input);
    assertArrayEquals(new int[]{0}, input);
  }

  @Test
  public void test4_whenSolution1() {
    Solution_1089 solution = new Solution_1089();
    int[] input = {1};
    solution.duplicateZeros(input);
    assertArrayEquals(new int[]{1}, input);
  }

  @Test
  public void test5_whenSolution1() {
    Solution_1089 solution = new Solution_1089();
    int[] input = {0, 0, 2, 0, 0, 4, 5, 0};
    solution.duplicateZeros(input);
    assertArrayEquals(new int[]{0, 0, 0, 0, 2, 0, 0, 0}, input);
  }
}