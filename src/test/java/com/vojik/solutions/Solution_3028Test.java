package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_3028Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(1, new Solution_3028().returnToBoundaryCount(new int[]{2, 3, -5}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(0, new Solution_3028().returnToBoundaryCount(new int[]{3, 2, -3, -4}));
  }
}