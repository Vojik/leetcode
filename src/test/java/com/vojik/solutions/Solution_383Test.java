package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_383Test {

  @Test
  public void test1_whenSolution1() {
    assertFalse(new Solution_383().canConstruct("a", "b"));
    assertFalse(new Solution_383().canConstruct("aa", "ab"));
    assertTrue(new Solution_383().canConstruct("aa", "aab"));
  }
}