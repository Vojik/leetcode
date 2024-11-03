package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_2270Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(2, new Solution_2270().waysToSplitArray(new int[]{10, 4, -8, 7}));
    assertEquals(2, new Solution_2270().waysToSplitArray(new int[]{2, 3, 1, 0}));
  }
}