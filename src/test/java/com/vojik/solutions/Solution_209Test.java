package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_209Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(2, new Solution_209().minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(1, new Solution_209().minSubArrayLen(4, new int[]{1, 4, 4}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(0, new Solution_209().minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
  }

}