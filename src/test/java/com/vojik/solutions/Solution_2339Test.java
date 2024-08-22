package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_2339Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(1, new Solution_2339().findClosestNumber(new int[] {-4, -2, 1, 4, 8}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(1, new Solution_2339().findClosestNumber(new int[] {-2, -1, 1}));
  }
}
