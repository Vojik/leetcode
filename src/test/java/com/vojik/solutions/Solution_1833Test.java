package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1833Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(4, new Solution_1833().maxIceCream(new int[]{1, 3, 2, 4, 1}, 7));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(0, new Solution_1833().maxIceCream(new int[]{10, 6, 8, 7, 7, 8}, 5));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(6, new Solution_1833().maxIceCream(new int[]{1, 6, 3, 1, 2, 5}, 20));
  }
}