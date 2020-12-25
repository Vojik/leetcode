package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Solution_1Test {

  @Test
  public void test1_whenSolution1() {
    Solution_1 solution = new Solution_1();
    int[] actual = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
    assertArrayEquals(new int[]{0, 1}, actual);
  }

  @Test
  public void test1_whenSolution2() {
    Solution_1 solution = new Solution_1();
    int[] actual = solution.twoSum2(new int[]{2, 7, 11, 15}, 9);
    assertArrayEquals(new int[]{0, 1}, actual);
  }

}