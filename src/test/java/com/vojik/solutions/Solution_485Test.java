package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_485Test {

  @Test
  public void test1_whenSolution1() {
    // given
    Solution_485 solution = new Solution_485();

    // when
    int actual = solution.findMaxConsecutiveOnes(new int[]{1});

    // then
    assertEquals(1, actual);
  }

  @Test
  public void test1_whenSolution2() {
    // given
    Solution_485 solution = new Solution_485();

    // when
    int actual = solution.findMaxConsecutiveOnes(new int[]{1, 1, 0, 0, 1, 1, 1});

    // then
    assertEquals(3, actual);
  }

  @Test
  public void test1_whenSolution3() {
    // given
    Solution_485 solution = new Solution_485();

    // when
    int actual = solution.findMaxConsecutiveOnes(new int[]{0});

    // then
    assertEquals(0, actual);
  }

  @Test
  public void test1_whenSolution4() {
    // given
    Solution_485 solution = new Solution_485();

    // when
    int actual = solution
        .findMaxConsecutiveOnes(new int[]{1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});

    // then
    assertEquals(12, actual);
  }

}