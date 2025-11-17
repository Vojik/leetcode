package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_1762Test {

  @Test
  public void tests_whenSolution1() {
    assertArrayEquals(
        new int[] {0, 2, 3}, new Solution_1762().findBuildings(new int[] {4, 2, 3, 1}));
    assertArrayEquals(
        new int[] {0, 1, 2, 3}, new Solution_1762().findBuildings(new int[] {4, 3, 2, 1}));
    assertArrayEquals(new int[] {3}, new Solution_1762().findBuildings(new int[] {1, 3, 2, 4}));
    assertArrayEquals(new int[] {3}, new Solution_1762().findBuildings(new int[] {2, 2, 2, 2}));
  }

  @Test
  public void tests_whenSolution2() {
    assertArrayEquals(
        new int[] {0, 2, 3}, new Solution_1762().findBuildings2(new int[] {4, 2, 3, 1}));
    assertArrayEquals(
        new int[] {0, 1, 2, 3}, new Solution_1762().findBuildings2(new int[] {4, 3, 2, 1}));
    assertArrayEquals(new int[] {3}, new Solution_1762().findBuildings2(new int[] {1, 3, 2, 4}));
    assertArrayEquals(new int[] {3}, new Solution_1762().findBuildings2(new int[] {2, 2, 2, 2}));
  }
}
