package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_1944Test {

  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(new int[] {3, 1, 2, 1, 1, 0},
        new Solution_1944().canSeePersonsCount(new int[] {10, 6, 8, 5, 11, 9}));
    assertArrayEquals(new int[] {4, 1, 1, 1, 0},
        new Solution_1944().canSeePersonsCount(new int[] {5, 1, 2, 3, 10}));
  }

}