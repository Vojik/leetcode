package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_561Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(4, new Solution_561().arrayPairSum(new int[]{1, 4, 3, 2}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(9, new Solution_561().arrayPairSum(new int[]{6, 2, 6, 5, 1, 2}));
  }
}