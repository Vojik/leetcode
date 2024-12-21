package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_1094Test {

  @Test
  public void test1_whenSolution1() {
    assertFalse(new Solution_1094().carPooling(new int[][]{{2, 1, 5}, {3, 3, 7}}, 4));
  }

  @Test
  public void test2_whenSolution1() {
    assertTrue(new Solution_1094().carPooling(new int[][]{{2, 1, 5}, {3, 3, 7}}, 5));
  }
}