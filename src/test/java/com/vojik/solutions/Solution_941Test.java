package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_941Test {

  @Test
  public void test1_whenSolution1() {
    // given
    Solution_941 solution = new Solution_941();

    // when
    boolean actual = solution.validMountainArray(new int[]{-4, -1, 0, -3, -10});

    // then
    Assertions.assertTrue(actual);
  }

  @Test
  public void test2_whenSolution1() {
    Solution_941 solution = new Solution_941();
    boolean actual = solution.validMountainArray(new int[]{2, 1});
    Assertions.assertFalse(actual);
  }

  @Test
  public void test3_whenSolution1() {
    Solution_941 solution = new Solution_941();
    boolean actual = solution.validMountainArray(new int[]{3, 5, 5});
    Assertions.assertFalse(actual);
  }

  @Test
  public void test4_whenSolution1() {
    Solution_941 solution = new Solution_941();
    boolean actual = solution.validMountainArray(new int[]{0, 3, 2, 1});
    Assertions.assertTrue(actual);
  }

  @Test
  public void test5_whenSolution1() {
    Solution_941 solution = new Solution_941();
    boolean actual = solution.validMountainArray(new int[]{0});
    Assertions.assertFalse(actual);
  }

  @Test
  public void test6_whenSolution1() {
    Solution_941 solution = new Solution_941();
    boolean actual = solution.validMountainArray(new int[]{0, 5});
    Assertions.assertFalse(actual);
  }

}