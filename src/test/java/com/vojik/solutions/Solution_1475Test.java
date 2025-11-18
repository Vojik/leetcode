package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_1475Test {

  @Test
  public void tests_whenSolution1() {
    assertArrayEquals(new int[] {4, 2, 4, 2, 3},
        new Solution_1475().finalPrices(new int[] {8, 4, 6, 2, 3}));
    assertArrayEquals(new int[] {1, 2, 3, 4, 5},
        new Solution_1475().finalPrices(new int[] {1, 2, 3, 4, 5}));
    assertArrayEquals(new int[] {9, 0, 1, 6},
        new Solution_1475().finalPrices(new int[] {10, 1, 1, 6}));
  }
}