package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_283Test {

  @Test
  public void test1_whenSolution() {
    Solution_283 solution = new Solution_283();
    int[] input = new int[]{0, 1, 0, 3, 12};
    int[] expected = new int[]{1, 3, 12, 0, 0};
    solution.moveZeroes(input);
    assertArrayEquals(expected, input);
  }

  @Test
  public void test2_whenSolution() {
    Solution_283 solution = new Solution_283();
    int[] input = null;
    int[] expected = null;
    solution.moveZeroes(input);
    assertArrayEquals(expected, input);
  }

  @Test
  public void test3_whenSolution() {
    Solution_283 solution = new Solution_283();
    int[] input = new int[]{};
    int[] expected = new int[]{};
    solution.moveZeroes(input);
    assertArrayEquals(expected, input);
  }

  @Test
  public void test4_whenSolution() {
    Solution_283 solution = new Solution_283();
    int[] input = new int[]{2, 1};
    int[] expected = new int[]{2, 1};
    solution.moveZeroes(input);
    assertArrayEquals(expected, input);
  }

}