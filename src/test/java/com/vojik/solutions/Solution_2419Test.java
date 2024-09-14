package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_2419Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(2, new Solution_2419().longestSubarray(new int[]{1, 2, 3, 3, 2, 2}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(1, new Solution_2419().longestSubarray(new int[]{1, 2, 3, 4}));
  }
}