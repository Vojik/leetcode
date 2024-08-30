package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_69Test {

  @Test
  public void test1_whenSolution1() {
    Solution_69 solution = new Solution_69();
    int actual = solution.mySqrt(4);
    assertEquals(2, actual);
  }


  @Test
  public void test2_whenSolution1() {
    Solution_69 solution = new Solution_69();
    int actual = solution.mySqrt(2147483647);
    assertEquals(46340, actual);
  }

  @Test
  public void test3_whenSolution1() {
    Solution_69 solution = new Solution_69();
    int actual = solution.mySqrt(0);
    assertEquals(0, actual);
  }

  @Test
  public void test4_whenSolution1() {
    Solution_69 solution = new Solution_69();
    int actual = solution.mySqrt(9);
    assertEquals(3, actual);
  }

  @Test
  public void test1_whenSolution2() {
    Solution_69 solution = new Solution_69();
    int actual = solution.mySqrt2(4);
    assertEquals(2, actual);
  }

  @Test
  public void test2_whenSolution2() {
    Solution_69 solution = new Solution_69();
    int actual = solution.mySqrt2(2147483647);
    assertEquals(46340, actual);
  }

  @Test
  public void test3_whenSolution2() {
    Solution_69 solution = new Solution_69();
    int actual = solution.mySqrt2(0);
    assertEquals(0, actual);
  }

  @Test
  public void test4_whenSolution2() {
    Solution_69 solution = new Solution_69();
    int actual = solution.mySqrt2(9);
    assertEquals(3, actual);
  }

  @Test
  public void test1_whenSolution3() {
    Solution_69 solution = new Solution_69();
    int actual = solution.mySqrt3(4);
    assertEquals(2, actual);
  }

  @Test
  public void test2_whenSolution3() {
    Solution_69 solution = new Solution_69();
    int actual = solution.mySqrt3(2147483647);
    assertEquals(46340, actual);
  }

  @Test
  public void test3_whenSolution3() {
    Solution_69 solution = new Solution_69();
    int actual = solution.mySqrt3(0);
    assertEquals(0, actual);
  }

  @Test
  public void test4_whenSolution3() {
    Solution_69 solution = new Solution_69();
    int actual = solution.mySqrt3(9);
    assertEquals(3, actual);
  }
}