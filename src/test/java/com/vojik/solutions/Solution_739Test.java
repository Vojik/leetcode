package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_739Test {

  @Test
  public void test1_whenSolution1() {
    Solution_739 solution = new Solution_739();
    int[] actual = solution.dailyTemperatures1(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
    assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, actual);
  }


  @Test
  public void test1_whenSolution2() {
    Solution_739 solution = new Solution_739();
    int[] actual = solution.dailyTemperatures2(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
    assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, actual);
  }

  @Test
  public void test1_whenSolution3() {
    Solution_739 solution = new Solution_739();
    int[] actual = solution.dailyTemperatures3(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
    assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, actual);
  }

  @Test
  public void test2_whenSolution3() {
    Solution_739 solution = new Solution_739();
    int[] actual = solution.dailyTemperatures3(new int[]{30,40,50,60});
    assertArrayEquals(new int[]{1,1,1,0}, actual);
  }

}