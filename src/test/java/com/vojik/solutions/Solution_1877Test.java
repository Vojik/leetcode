package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1877Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(7, new Solution_1877().minPairSum(new int[]{3, 5, 2, 3}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(8, new Solution_1877().minPairSum(new int[]{3, 5, 4, 2, 4, 6}));
  }
}