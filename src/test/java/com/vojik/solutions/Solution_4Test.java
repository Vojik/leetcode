package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_4Test {

  @Test
  public void test1_whenSolution1() {
    // given
    Solution_4 solution = new Solution_4();

    // when
    double actual = solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2, 4, 5});

    // then
    assertEquals(3, actual);
  }

  @Test
  public void test2_whenSolution1() {
    Solution_4 solution = new Solution_4();
    double actual = solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
    assertEquals(2, actual);
  }

  @Test
  public void test3_whenSolution1() {
    Solution_4 solution = new Solution_4();
    double actual = solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3,4});
    assertEquals(2.5, actual);
  }

  @Test
  public void test4_whenSolution1() {
    Solution_4 solution = new Solution_4();
    double actual = solution.findMedianSortedArrays(new int[]{0,0}, new int[]{0,0});
    assertEquals(0, actual);
  }

  @Test
  public void test5_whenSolution1() {
    Solution_4 solution = new Solution_4();
    double actual = solution.findMedianSortedArrays(new int[]{}, new int[]{1});
    assertEquals(1, actual);
  }

  @Test
  public void test6_whenSolution1() {
    Solution_4 solution = new Solution_4();
    double actual = solution.findMedianSortedArrays(new int[]{5}, new int[]{});
    assertEquals(5, actual);
  }

}