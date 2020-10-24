package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_153Test {

  @Test
  public void test1_whenSolution1() {
    Solution_153 solution = new Solution_153();
    int actual = solution.findMin(new int[]{3, 4, 5, 1, 2});
    assertEquals(1, actual);
  }

  @Test
  public void test2_whenSolution1() {
    Solution_153 solution = new Solution_153();
    int actual = solution.findMin(new int[]{4,5,6,7,0,1,2});
    assertEquals(0, actual);
  }

  @Test
  public void test3_whenSolution1() {
    Solution_153 solution = new Solution_153();
    int actual = solution.findMin(new int[]{3,1,2});
    assertEquals(1, actual);
  }

  @Test
  public void test4_whenSolution1() {
    Solution_153 solution = new Solution_153();
    int actual = solution.findMin(new int[]{2});
    assertEquals(2, actual);
  }

}