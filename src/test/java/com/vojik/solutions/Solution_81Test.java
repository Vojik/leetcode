package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_81Test {

  @Test
  public void test1_whenSolution1() {
    assertTrue(new Solution_81().search(new int[]{2, 5, 6, 0, 0, 1, 2}, 0));
  }

  @Test
  public void test2_whenSolution1() {
    assertFalse(new Solution_81().search(new int[]{2, 5, 6, 0, 0, 1, 2}, 3));
  }

  @Test
  public void test3_whenSolution1() {
    assertTrue(new Solution_81().search(new int[]{1, 0, 1, 1, 1}, 0));
  }

  @Test
  public void test4_whenSolution1() {
    assertTrue(new Solution_81().search(new int[]{0, 1, 1, 2, 0, 0}, 2));
  }
}