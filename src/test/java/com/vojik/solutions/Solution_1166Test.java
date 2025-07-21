package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_1166Test {

  @Test
  public void test1_whenSolution1() {
    Solution_1166 solution = new Solution_1166();
    assertTrue(solution.createPath("/a", 1));
    assertEquals(1, solution.get("/a"));
  }

  @Test
  public void test2_whenSolution1() {
    Solution_1166 solution = new Solution_1166();
    assertTrue(solution.createPath("/leet", 1));
    assertTrue(solution.createPath("/leet/code", 2));
    assertEquals(2, solution.get("/leet/code"));
    assertFalse(solution.createPath("/c/d", 1));
    assertEquals(-1, solution.get("/c"));
  }
}