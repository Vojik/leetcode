package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_704Test {

  @Test
  public void test1() {
    // given
    Solution_704 solution = new Solution_704();
    int[] input = new int[]{-1, 0, 3, 5, 9, 12};

    // when
    int actual = solution.search(input, 9);

    // then
    assertEquals(4, actual);
  }

  @Test
  public void test2() {
    Solution_704 solution = new Solution_704();
    int[] input = new int[]{-1, 0, 3, 5, 9, 12};
    int actual = solution.search(input, 2);
    assertEquals(-1, actual);
  }

}