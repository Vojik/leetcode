package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_121Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(5, new Solution_121().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(0, new Solution_121().maxProfit(new int[]{7, 6, 4, 3, 1}));
  }
}