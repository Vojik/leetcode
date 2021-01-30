package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_84Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(10, new Solution_84().largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(4, new Solution_84().largestRectangleArea(new int[]{2, 4}));
  }
}