package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_278Test {

  @Test
  public void test1_whenSolution() {
    Solution_278 solution = new Solution_278(1);
    int actual = solution.firstBadVersion(5);
    assertEquals(1, actual);
  }

  @Test
  public void test2_whenSolution() {
    Solution_278 solution = new Solution_278(2);
    int actual = solution.firstBadVersion(5);
    assertEquals(2, actual);
  }

  @Test
  public void test3_whenSolution() {
    Solution_278 solution = new Solution_278(3);
    int actual = solution.firstBadVersion(5);
    assertEquals(3, actual);
  }

  @Test
  public void test4_whenSolution() {
    Solution_278 solution = new Solution_278(4);
    int actual = solution.firstBadVersion(5);
    assertEquals(4, actual);
  }

  @Test
  public void test5_whenSolution() {
    Solution_278 solution = new Solution_278(5);
    int actual = solution.firstBadVersion(5);
    assertEquals(5, actual);
  }

  @Test
  public void test6_whenSolution() {
    Solution_278 solution = new Solution_278(1);
    int actual = solution.firstBadVersion(1);
    assertEquals(1, actual);
  }

  @Test
  public void test1_whenSolution2() {
    Solution_278 solution = new Solution_278(1);
    int actual = solution.solution2(5);
    assertEquals(1, actual);
  }

  @Test
  public void test2_whenSolution2() {
    Solution_278 solution = new Solution_278(2);
    int actual = solution.solution2(5);
    assertEquals(2, actual);
  }

  @Test
  public void test3_whenSolution2() {
    Solution_278 solution = new Solution_278(3);
    int actual = solution.solution2(5);
    assertEquals(3, actual);
  }

  @Test
  public void test4_whenSolution2() {
    Solution_278 solution = new Solution_278(4);
    int actual = solution.solution2(5);
    assertEquals(4, actual);
  }

  @Test
  public void test5_whenSolution2() {
    Solution_278 solution = new Solution_278(5);
    int actual = solution.solution2(5);
    assertEquals(5, actual);
  }

  @Test
  public void test6_whenSolution2() {
    Solution_278 solution = new Solution_278(1);
    int actual = solution.solution2(1);
    assertEquals(1, actual);
  }
}