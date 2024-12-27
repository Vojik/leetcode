package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_76Test {

  @Test
  public void test_whenSolution1() {
    assertEquals("BANC", new Solution_76().minWindow("ADOBECODEBANC", "ABC"));
    assertEquals("a", new Solution_76().minWindow("a", "a"));
    assertEquals("", new Solution_76().minWindow("a", "aa"));
  }

}