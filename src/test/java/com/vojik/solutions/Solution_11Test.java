package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_11Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(49,
        new Solution_11().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(1,
        new Solution_11().maxArea(new int[]{1, 1}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(16,
        new Solution_11().maxArea(new int[]{4, 3, 2, 1, 4}));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals(2,
        new Solution_11().maxArea(new int[]{1, 2, 1}));
  }

}