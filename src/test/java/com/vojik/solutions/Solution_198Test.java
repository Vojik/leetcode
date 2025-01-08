package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_198Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(4, new Solution_198().rob(new int[]{1, 2, 3, 1}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(12, new Solution_198().rob(new int[]{2, 7, 9, 3, 1}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(4, new Solution_198().rob(new int[]{2, 1, 1, 2}));
  }
}
