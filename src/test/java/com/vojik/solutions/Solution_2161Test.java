package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_2161Test {

  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(new int[] {9, 5, 3, 10, 10, 12, 14},
        new Solution_2161().pivotArray(new int[] {9, 12, 5, 10, 14, 3, 10}, 10));
    assertArrayEquals(new int[] {-3, 2, 4, 3},
        new Solution_2161().pivotArray(new int[] {-3, 4, 3, 2}, 2));
  }

}