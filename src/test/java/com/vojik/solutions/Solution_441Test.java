package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_441Test {

  @Test
  public void test1_whenSolution() {
    assertEquals(2, new Solution_441().arrangeCoins(5));
  }

  @Test
  public void test2_whenSolution() {
    assertEquals(3, new Solution_441().arrangeCoins(8));
  }

  @Test
  public void test3_whenSolution() {
    assertEquals(8, new Solution_441().arrangeCoins(40));
  }
  
}