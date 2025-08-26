package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_16Test {

  @Test
  public void tests_whenSolution1() {
    assertEquals(2, new Solution_16().threeSumClosest(new int[] {-1, 2, 1, -4}, 1));
    assertEquals(0, new Solution_16().threeSumClosest(new int[] {0, 0, 0}, 1));
    assertEquals(15, new Solution_16().threeSumClosest(new int[] {2, 5, 6, 7}, 16));
  }

}