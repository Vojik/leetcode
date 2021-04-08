package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_1578Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(3, new Solution_1578().minCost("abaac", new int[]{1,2,3,4,5}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(0, new Solution_1578().minCost("abc", new int[]{1,2,3}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(2, new Solution_1578().minCost("aabaa", new int[]{1,2,3,4,1}));
  }
}