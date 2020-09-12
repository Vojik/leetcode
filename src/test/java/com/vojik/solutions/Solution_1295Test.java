package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_1295Test {

  @Test
  public void test1_whenSolution1() {
    Solution_1295 solution = new Solution_1295();
    int actual = solution.findNumbers(new int[]{12, 345, 2, 6, 7896});
    Assertions.assertEquals(2, actual);
  }

  @Test
  public void test2_whenSolution1() {
    Solution_1295 solution = new Solution_1295();
    int actual = solution.findNumbers(new int[]{12, 3415, 2, 6, 7896});
    Assertions.assertEquals(3, actual);
  }

  @Test
  public void test3_whenSolution1() {
    Solution_1295 solution = new Solution_1295();
    int actual = solution.findNumbers(new int[]{4});
    Assertions.assertEquals(0, actual);
  }

  @Test
  public void test4_whenSolution1() {
    Solution_1295 solution = new Solution_1295();
    int actual = solution.findNumbers(new int[]{12, 34150, 2, 6, 78936});
    Assertions.assertEquals(1, actual);
  }

  @Test
  public void test1_whenSolution2() {
    Solution_1295 solution = new Solution_1295();
    int actual = solution.findNumbers2(new int[]{12, 345, 2, 6, 7896});
    Assertions.assertEquals(2, actual);
  }

  @Test
  public void test2_whenSolution2() {
    Solution_1295 solution = new Solution_1295();
    int actual = solution.findNumbers2(new int[]{12, 3415, 2, 6, 7896});
    Assertions.assertEquals(3, actual);
  }

  @Test
  public void test3_whenSolution2() {
    Solution_1295 solution = new Solution_1295();
    int actual = solution.findNumbers2(new int[]{4});
    Assertions.assertEquals(0, actual);
  }

  @Test
  public void test4_whenSolution2() {
    Solution_1295 solution = new Solution_1295();
    int actual = solution.findNumbers2(new int[]{12, 34150, 2, 6, 78936});
    Assertions.assertEquals(1, actual);
  }
}