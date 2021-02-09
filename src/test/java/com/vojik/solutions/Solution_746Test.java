package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_746Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(15, new Solution_746().minCostClimbingStairs(new int[]{10, 15, 20}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(6,
        new Solution_746().minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
  }
}