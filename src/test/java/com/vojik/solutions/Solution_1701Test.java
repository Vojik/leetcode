package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_1701Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(5, new Solution_1701().averageWaitingTime(new int[][] {{1, 2}, {2, 5}, {4, 3}}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(
        3.25,
        new Solution_1701().averageWaitingTime(new int[][] {{5, 2}, {5, 4}, {10, 3}, {20, 1}}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(2, new Solution_1701().averageWaitingTime(new int[][] {{1, 2}}));
  }
}
