package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_1480Test {

  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(new int[]{1, 3, 6, 10},
        new Solution_1480().runningSum(new int[]{1, 2, 3, 4}));
  }

  @Test
  public void test2_whenSolution1() {
    assertArrayEquals(new int[]{1, 2, 3, 4, 5},
        new Solution_1480().runningSum(new int[]{1, 1, 1, 1, 1}));
  }

  @Test
  public void test3_whenSolution1() {
    assertArrayEquals(new int[]{3, 4, 6, 16, 17},
        new Solution_1480().runningSum(new int[]{3, 1, 2, 10, 1}));
  }

}