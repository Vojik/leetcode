package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_875Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(4,
        new Solution_875().minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(30,
        new Solution_875().minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(23,
        new Solution_875().minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));
  }

}