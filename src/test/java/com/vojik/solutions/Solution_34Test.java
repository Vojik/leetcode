package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_34Test {

  @Test
  public void test1_whenSolution2() {
    Solution_34 solution = new Solution_34();
    int[] actual = solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
    assertArrayEquals(new int[]{3, 4}, actual);
  }

  @Test
  public void test2_whenSolution2() {
    Solution_34 solution = new Solution_34();
    int[] actual = solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6);
    assertArrayEquals(new int[]{-1, -1}, actual);
  }

  @Test
  public void test3_whenSolution2() {
    Solution_34 solution = new Solution_34();
    int[] actual = solution.searchRange(new int[]{}, 0);
    assertArrayEquals(new int[]{-1, -1}, actual);
  }

  @Test
  public void test4_whenSolution2() {
    Solution_34 solution = new Solution_34();
    int[] actual = solution.searchRange(new int[]{1}, 1);
    assertArrayEquals(new int[]{0, 0}, actual);
  }

  @Test
  public void test5_whenSolution2() {
    Solution_34 solution = new Solution_34();
    int[] actual = solution.searchRange(new int[]{1}, 2);
    assertArrayEquals(new int[]{-1, -1}, actual);
  }

  @Test
  public void test6_whenSolution2() {
    Solution_34 solution = new Solution_34();
    int[] actual = solution.searchRange(new int[]{2, 2}, 8);
    assertArrayEquals(new int[]{-1, -1}, actual);
  }

  @Test
  public void test7_whenSolution2() {
    Solution_34 solution = new Solution_34();
    int[] actual = solution.searchRange(new int[]{2, 2}, 2);
    assertArrayEquals(new int[]{0, 1}, actual);
  }
}