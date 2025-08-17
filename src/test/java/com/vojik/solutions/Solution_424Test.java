package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_424Test {

  @Test
  public void tests_whenSolution1() {
    assertEquals(4, new Solution_424().characterReplacement("ABAB", 2));
    assertEquals(4, new Solution_424().characterReplacement("AABABBA", 1));
    assertEquals(2, new Solution_424().characterReplacement("ABAA", 0));
  }

  @Test
  public void tests_whenSolution2() {
    assertEquals(4, new Solution_424().characterReplacement2("ABAB", 2));
    assertEquals(4, new Solution_424().characterReplacement2("AABABBA", 1));
    assertEquals(2, new Solution_424().characterReplacement2("ABAA", 0));
  }
}