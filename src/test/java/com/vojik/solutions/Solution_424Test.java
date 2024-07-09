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

  @Test
  public void test3_whenSolution() {
    assertEquals(2, new Solution_424().characterReplacement("ABAA", 0));
  }

  @Test
  public void test1_whenSolution2() {
    assertEquals(4, new Solution_424().characterReplacement2("ABAB", 2));
  }

  @Test
  public void test2_whenSolution2() {
    assertEquals(4, new Solution_424().characterReplacement2("AABABBA", 1));
  }

  @Test
  public void test3_whenSolution2() {
    assertEquals(2, new Solution_424().characterReplacement2("ABAA", 0));
  }
}