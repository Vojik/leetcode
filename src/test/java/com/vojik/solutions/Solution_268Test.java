package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_268Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(2, new Solution_268().missingNumber(new int[] {3, 0, 1}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(2, new Solution_268().missingNumber(new int[] {0, 1}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(8, new Solution_268().missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1}));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals(1, new Solution_268().missingNumber(new int[] {0}));
  }

  /// //////////////////////////////////

  @Test
  public void test1_whenSolution2() {
    assertEquals(2, new Solution_268().missingNumber2(new int[] {3, 0, 1}));
  }

  @Test
  public void test2_whenSolution2() {
    assertEquals(2, new Solution_268().missingNumber2(new int[] {0, 1}));
  }

  @Test
  public void test3_whenSolution2() {
    assertEquals(8, new Solution_268().missingNumber2(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1}));
  }

  @Test
  public void test4_whenSolution2() {
    assertEquals(1, new Solution_268().missingNumber2(new int[] {0}));
  }

  /// //////////////////////////////////

  @Test
  public void test1_whenSolution3() {
    assertEquals(2, new Solution_268().missingNumber3(new int[] {3, 0, 1}));
  }

  @Test
  public void test2_whenSolution3() {
    assertEquals(2, new Solution_268().missingNumber3(new int[] {0, 1}));
  }

  @Test
  public void test3_whenSolution3() {
    assertEquals(8, new Solution_268().missingNumber3(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1}));
  }

  @Test
  public void test4_whenSolution3() {
    assertEquals(1, new Solution_268().missingNumber3(new int[] {0}));
  }
}