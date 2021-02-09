package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_217Test {

  @Test
  public void test1_whenSolution1() {
    assertFalse(new Solution_217().containsDuplicate(new int[]{1, 2, 3, 4}));
  }

  @Test
  public void test2_whenSolution1() {
    assertTrue(new Solution_217().containsDuplicate(new int[]{1, 2, 3, 1}));
  }

  @Test
  public void test3_whenSolution1() {
    assertFalse(new Solution_217().containsDuplicate(new int[]{0}));
  }
}