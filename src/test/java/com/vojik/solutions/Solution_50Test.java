package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_50Test {

  @Test
  public void test1_whenSolution1() {
    Solution_50 solution = new Solution_50();
    double actual = solution.myPow(2, 10);
    assertEquals(1024, actual);
  }

  @Test
  public void test2_whenSolution1() {
    Solution_50 solution = new Solution_50();
    double actual = solution.myPow(2.1, 3);
    assertEquals(String.valueOf(9.261), String.format("%,.3f", actual));
  }

  @Test
  public void test3_whenSolution1() {
    Solution_50 solution = new Solution_50();
    double actual = solution.myPow(2, -2);
    assertEquals(0.25, actual);
  }

  @Test
  public void test1_whenSolution2() {
    Solution_50 solution = new Solution_50();
    double actual = solution.myPow2(2, 10);
    assertEquals(1024, actual);
  }

  @Test
  public void test2_whenSolution2() {
    Solution_50 solution = new Solution_50();
    double actual = solution.myPow2(2.1, 3);
    assertEquals(String.valueOf(9.261), String.format("%,.3f", actual));
  }

  @Test
  public void test3_whenSolution2() {
    Solution_50 solution = new Solution_50();
    double actual = solution.myPow2(2, -2);
    assertEquals(0.25, actual);
  }
}