package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_414Test {

  @Test
  public void test1_whenSolution() {
    Solution_414 solution = new Solution_414();
    int actual = solution.thirdMax(new int[]{3, 2, 1});
    assertEquals(1, actual);
  }

  @Test
  public void test2_whenSolution() {
    Solution_414 solution = new Solution_414();
    int actual = solution.thirdMax(new int[]{2, 1});
    assertEquals(2, actual);
  }

  @Test
  public void test3_whenSolution() {
    Solution_414 solution = new Solution_414();
    int actual = solution.thirdMax(new int[]{2, 2, 2, 3, 1});
    assertEquals(1, actual);
  }

  @Test
  public void test4_whenSolution() {
    Solution_414 solution = new Solution_414();
    int actual = solution.thirdMax(new int[]{1, 2, -2147483648});
    assertEquals(-2147483648, actual);
  }

  @Test
  public void test5_whenSolution() {
    Solution_414 solution = new Solution_414();
    int actual = solution.thirdMax(new int[]{-2147483648, 1, 1});
    assertEquals(1, actual);
  }

}