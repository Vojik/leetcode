package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_643Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(12.75000,
        new Solution_643().findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(5.00000,
        new Solution_643().findMaxAverage(new int[]{5}, 1));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertEquals(-1.00000,
        new Solution_643().findMaxAverage(new int[]{-1}, 1));
  }

}