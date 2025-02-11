package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_1752Test {

  @Test
  public void test1_whenSolution1() {
    assertTrue(new Solution_1752().check(new int[] {3, 4, 5, 1, 2}));
    assertTrue(new Solution_1752().check(new int[] {1, 2, 3}));
    assertTrue(new Solution_1752().check(new int[] {6, 10, 6}));
    assertFalse(new Solution_1752().check(new int[] {2, 1, 3, 4}));
  }
}