package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_904Test {

  @Test
  public void test_whenSolution1() {
    assertEquals(3, new Solution_904().totalFruit(new int[] {1, 2, 1}));
    assertEquals(3, new Solution_904().totalFruit(new int[] {0, 1, 2, 2}));
    assertEquals(4, new Solution_904().totalFruit(new int[] {1, 2, 3, 2, 2}));
  }
}