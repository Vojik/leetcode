package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_874Test {

  @Test
  public void tests_whenSolution1() {
    assertEquals(25,
        new Solution_874().robotSim(new int[] {4, -1, 3}, new int[][] {}));

    assertEquals(65,
        new Solution_874().robotSim(new int[] {4, -1, 4, -2, 4}, new int[][] {{2, 4}}));

    assertEquals(36,
        new Solution_874().robotSim(new int[] {6, -1, -1, 6}, new int[][] {{0, 0}}));
  }

}