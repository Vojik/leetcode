package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_605Test {

  @Test
  public void test1_whenSolution1() {
    assertTrue(new Solution_605().canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
  }

  @Test
  public void test2_whenSolution1() {
    assertFalse(new Solution_605().canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
  }

}