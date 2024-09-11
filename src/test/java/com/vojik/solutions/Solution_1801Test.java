package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_1801Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(6, new Solution_1801().getNumberOfBacklogOrders(
        new int[][]{{10, 5, 0}, {15, 2, 1}, {25, 1, 1}, {30, 4, 0}}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(999999984, new Solution_1801().getNumberOfBacklogOrders(
        new int[][]{{7, 1000000000, 1}, {15, 3, 0}, {5, 999999995, 0}, {5, 1, 1}}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(34, new Solution_1801().getNumberOfBacklogOrders(
        new int[][]{{26, 7, 0}, {16, 1, 1}, {14, 20, 0}, {23, 15, 1}, {24, 26, 0}, {19, 4, 1},
            {1, 1, 0}}));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals(22, new Solution_1801().getNumberOfBacklogOrders(
        new int[][]{{1, 29, 1}, {22, 7, 1}, {24, 1, 0}, {25, 15, 1}, {18, 8, 1}, {8, 22, 0},
            {25, 15, 1}, {30, 1, 1}, {27, 30, 0}}));
  }


}


