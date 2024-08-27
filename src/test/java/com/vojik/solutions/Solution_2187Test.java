package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_2187Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(3, new Solution_2187().minimumTime(new int[]{1, 2, 3}, 5));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(2, new Solution_2187().minimumTime(new int[]{2}, 1));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(25, new Solution_2187().minimumTime(new int[]{5, 10, 10}, 9));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals(100000000000L, new Solution_2187().minimumTime(new int[]{10000}, 10000000));
  }
}