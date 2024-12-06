package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_31Test {

  @Test
  public void test1_whenSolution1() {
    int[] input = new int[]{1, 2, 3};
    int[] expected = new int[]{1, 3, 2};
    new Solution_31().nextPermutation(input);
    assertArrayEquals(expected, input);
  }

  @Test
  public void test2_whenSolution1() {
    int[] input = new int[]{3, 2, 1};
    int[] expected = new int[]{1, 2, 3};
    new Solution_31().nextPermutation(input);
    assertArrayEquals(expected, input);
  }

  @Test
  public void test3_whenSolution1() {
    int[] input = new int[]{1, 1, 5};
    int[] expected = new int[]{1, 5, 1};
    new Solution_31().nextPermutation(input);
    assertArrayEquals(expected, input);
  }

}