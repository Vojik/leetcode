package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_1346Test {

  @Test
  public void test1_whenSolution1() {
    Solution_1346 solution = new Solution_1346();
    boolean actual = solution.checkIfExist(new int[]{10, 2, 5, 3});
    assertTrue(actual);
  }

  @Test
  public void test2_whenSolution1() {
    Solution_1346 solution = new Solution_1346();
    boolean actual = solution.checkIfExist(new int[]{7, 1, 14, 11});
    assertTrue(actual);
  }

  @Test
  public void test3_whenSolution1() {
    Solution_1346 solution = new Solution_1346();
    boolean actual = solution.checkIfExist(new int[]{3, 1, 7, 11});
    assertFalse(actual);
  }

  @Test
  public void test4_whenSolution1() {
    Solution_1346 solution = new Solution_1346();
    boolean actual = solution.checkIfExist(new int[]{-7, 1, -14, 11});
    assertTrue(actual);
  }

  @Test
  public void test5_whenSolution1() {
    Solution_1346 solution = new Solution_1346();
    boolean actual = solution.checkIfExist(new int[]{-7, 1, 14, 11});
    assertFalse(actual);
  }
}