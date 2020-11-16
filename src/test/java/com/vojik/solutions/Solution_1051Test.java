package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1051Test {

  @Test
  public void test1_whenSolution1() {
    Solution_1051 solution = new Solution_1051();
    int actual = solution.heightChecker(new int[]{1, 1, 4, 2, 1, 3});
    assertEquals(3, actual);
  }

  @Test
  public void test2_whenSolution1() {
    Solution_1051 solution = new Solution_1051();
    int actual = solution.heightChecker(new int[]{5, 1, 2, 3, 4});
    assertEquals(5, actual);
  }

  @Test
  public void test3_whenSolution1() {
    Solution_1051 solution = new Solution_1051();
    int actual = solution.heightChecker(new int[]{1, 2, 3, 4, 5});
    assertEquals(0, actual);
  }

}