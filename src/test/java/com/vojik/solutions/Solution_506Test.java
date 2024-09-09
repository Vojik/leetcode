package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_506Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertArrayEquals(
        new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"},
        new Solution_506().findRelativeRanks(new int[]{5, 4, 3, 2, 1}));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertArrayEquals(
        new String[]{"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"},
        new Solution_506().findRelativeRanks(new int[]{10, 3, 8, 9, 4}));
  }

}