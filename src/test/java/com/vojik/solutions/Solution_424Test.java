package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_424Test {

  @Test
  public void test1_whenSolution() {
    assertEquals(4, new Solution_424().characterReplacement("ABAB", 2));
  }

  @Test
  public void test2_whenSolution() {
    assertEquals(4, new Solution_424().characterReplacement("AABABBA", 1));
  }
}