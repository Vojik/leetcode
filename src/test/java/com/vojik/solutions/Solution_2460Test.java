package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_2460Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(new int[] {1, 4, 2, 0, 0, 0},
        new Solution_2460().applyOperations(new int[] {1, 2, 2, 1, 1, 0}));
    assertEquals(new int[] {1, 0}, new Solution_2460().applyOperations(new int[] {0, 1}));
  }

}