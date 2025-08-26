package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_259Test {

  @Test
  public void tests_whenSolution1() {
    assertEquals(2, new Solution_259().threeSumSmaller(new int[] {-2, 0, 1, 3}, 2));
    assertEquals(0, new Solution_259().threeSumSmaller(new int[] {}, 0));
    assertEquals(0, new Solution_259().threeSumSmaller(new int[] {0}, 0));
  }
}