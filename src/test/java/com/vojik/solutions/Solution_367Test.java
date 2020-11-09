package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_367Test {

  @Test
  public void test1_whenSolution1() {
    Solution_367 solution = new Solution_367();
    boolean actual = solution.isPerfectSquare(4);
    assertTrue(actual);
  }

  @Test
  public void test2_whenSolution1() {
    Solution_367 solution = new Solution_367();
    boolean actual = solution.isPerfectSquare(64);
    assertTrue(actual);
  }

  @Test
  public void test3_whenSolution1() {
    Solution_367 solution = new Solution_367();
    boolean actual = solution.isPerfectSquare(65536);
    assertTrue(actual);
  }

  @Test
  public void test4_whenSolution1() {
    Solution_367 solution = new Solution_367();
    boolean actual = solution.isPerfectSquare(36);
    assertTrue(actual);
  }

  @Test
  public void test5_whenSolution1() {
    Solution_367 solution = new Solution_367();
    boolean actual = solution.isPerfectSquare(9);
    assertTrue(actual);
  }

  @Test
  public void test6_whenSolution1() {
    Solution_367 solution = new Solution_367();
    boolean actual = solution.isPerfectSquare(8);
    assertFalse(actual);
  }

  @Test
  public void test7_whenSolution1() {
    Solution_367 solution = new Solution_367();
    boolean actual = solution.isPerfectSquare(14);
    assertFalse(actual);
  }

  @Test
  public void test8_whenSolution1() {
    Solution_367 solution = new Solution_367();
    boolean actual = solution.isPerfectSquare(1);
    assertTrue(actual);
  }

  @Test
  public void test9_whenSolution1() {
    Solution_367 solution = new Solution_367();
    boolean actual = solution.isPerfectSquare(2147483647);
    assertFalse(actual);
  }

  @Test
  public void test10_whenSolution1() {
    Solution_367 solution = new Solution_367();
    boolean actual = solution.isPerfectSquare(808201);
    assertTrue(actual);
  }

  @Test
  public void test11_whenSolution1() {
    Solution_367 solution = new Solution_367();
    boolean actual = solution.isPerfectSquare(2147395600);
    assertTrue(actual);
  }
}