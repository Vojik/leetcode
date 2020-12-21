package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_279Test {

  @Test
  public void test1_whenSolution1() {
    Solution_279 solution = new Solution_279();
    int actual = solution.numSquares(12);
    Assertions.assertEquals(3, actual);
  }

  @Test
  public void test2_whenSolution1() {
    Solution_279 solution = new Solution_279();
    int actual = solution.numSquares(13);
    Assertions.assertEquals(2, actual);
  }

  @Test
  public void test3_whenSolution1() {
    Solution_279 solution = new Solution_279();
    int actual = solution.numSquares(1);
    Assertions.assertEquals(1, actual);
  }

  @Test
  public void test4_whenSolution1() {
    Solution_279 solution = new Solution_279();
    int actual = solution.numSquares(7168);
    Assertions.assertEquals(4, actual);
  }

}