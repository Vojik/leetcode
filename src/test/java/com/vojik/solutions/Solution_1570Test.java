package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1570Test {

  @Test
  public void test1_whenSolution1() {
    Solution_1570 v1 = new Solution_1570(new int[] {1, 0, 0, 2, 3});
    Solution_1570 v2 = new Solution_1570(new int[] {0, 3, 0, 4, 0});
    assertEquals(8, v1.dotProduct(v2));
  }

  @Test
  public void test2_whenSolution1() {
    Solution_1570 v1 = new Solution_1570(new int[] {0, 1, 0, 0, 0});
    Solution_1570 v2 = new Solution_1570(new int[] {0, 0, 0, 0, 2});
    assertEquals(0, v1.dotProduct(v2));
  }

  @Test
  public void test3_whenSolution1() {
    Solution_1570 v1 = new Solution_1570(new int[] {0, 1, 0, 0, 2, 0, 0});
    Solution_1570 v2 = new Solution_1570(new int[] {1, 0, 0, 0, 3, 0, 4});
    assertEquals(6, v1.dotProduct(v2));
  }
}
