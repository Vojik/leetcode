package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_53Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(6, new Solution_53().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(1, new Solution_53().maxSubArray(new int[]{1}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(23, new Solution_53().maxSubArray(new int[]{5, 4, -1, 7, 8}));
  }
}