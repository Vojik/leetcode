package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_55Test {

  @Test
  public void test_whenSolution1() {
    assertTrue(new Solution_55().canJump(new int[] {2, 3, 1, 1, 4}));
    assertFalse(new Solution_55().canJump(new int[] {3, 2, 1, 0, 4}));
  }
}