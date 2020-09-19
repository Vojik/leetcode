package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_88Test {

  @Test
  public void test1_whenSolution1() {
    Solution_88 solution = new Solution_88();
    int[] input = new int[]{1, 2, 3, 0, 0, 0};
    solution.merge(input, 3, new int[]{2, 5, 6}, 3);
    assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, input);
  }

  @Test
  public void test2_whenSolution1() {
    Solution_88 solution = new Solution_88();
    int[] input = new int[]{1, 2, 3, 0, 0, 0};
    solution.merge(input, 3, new int[]{1, 2, 3}, 3);
    assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3}, input);
  }

  @Test
  public void test3_whenSolution1() {
    Solution_88 solution = new Solution_88();
    int[] input = new int[]{9, 0, 0};
    solution.merge(input, 1, new int[]{1, 2}, 2);
    assertArrayEquals(new int[]{1, 2, 9}, input);
  }
}