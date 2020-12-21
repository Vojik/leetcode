package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_20Test {

  @Test
  public void test1_whenSolution1() {
    Solution_20 solution = new Solution_20();
    assertTrue(solution.isValid("()"));
  }

  @Test
  public void test2_whenSolution1() {
    Solution_20 solution = new Solution_20();
    assertTrue(solution.isValid("()[]{}"));
  }

  @Test
  public void test3_whenSolution1() {
    Solution_20 solution = new Solution_20();
    assertFalse(solution.isValid("(]"));
  }

  @Test
  public void test4_whenSolution1() {
    Solution_20 solution = new Solution_20();
    assertFalse(solution.isValid("([)]"));
  }

  @Test
  public void test5_whenSolution1() {
    Solution_20 solution = new Solution_20();
    assertTrue(solution.isValid("{[]}"));
  }

  @Test
  public void test6_whenSolution1() {
    Solution_20 solution = new Solution_20();
    assertFalse(solution.isValid("]"));
  }

  /////

  @Test
  public void test1_whenSolution2() {
    Solution_20 solution = new Solution_20();
    assertTrue(solution.isValid("()"));
  }

  @Test
  public void test2_whenSolution2() {
    Solution_20 solution = new Solution_20();
    assertTrue(solution.isValid("()[]{}"));
  }

  @Test
  public void test3_whenSolution2() {
    Solution_20 solution = new Solution_20();
    assertFalse(solution.isValid("(]"));
  }

  @Test
  public void test4_whenSolution2() {
    Solution_20 solution = new Solution_20();
    assertFalse(solution.isValid("([)]"));
  }

  @Test
  public void test5_whenSolution2() {
    Solution_20 solution = new Solution_20();
    assertTrue(solution.isValid("{[]}"));
  }

  @Test
  public void test6_whenSolution2() {
    Solution_20 solution = new Solution_20();
    assertFalse(solution.isValid("]"));
  }
}