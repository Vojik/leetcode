package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_1762Test {

  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(
        new int[] {0, 2, 3}, new Solution_1762().findBuildings(new int[] {4, 2, 3, 1}));
  }

  @Test
  public void test2_whenSolution1() {
    assertArrayEquals(
        new int[] {0, 1, 2, 3}, new Solution_1762().findBuildings(new int[] {4, 3, 2, 1}));
  }

  @Test
  public void test3_whenSolution1() {
    assertArrayEquals(new int[] {3}, new Solution_1762().findBuildings(new int[] {1, 3, 2, 4}));
  }

  @Test
  public void test4_whenSolution1() {
    assertArrayEquals(new int[] {3}, new Solution_1762().findBuildings(new int[] {2, 2, 2, 2}));
  }
}
