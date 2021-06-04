package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1465Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(4, new Solution_1465().maxArea(5, 4, new int[] {1, 2, 4}, new int[] {1, 3}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(6, new Solution_1465().maxArea(5, 4, new int[] {3, 1}, new int[] {1}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(9, new Solution_1465().maxArea(5, 4, new int[] {3}, new int[] {3}));
  }
}
