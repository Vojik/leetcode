package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1512Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(4, new Solution_1512().numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(6, new Solution_1512().numIdenticalPairs(new int[]{1, 1, 1, 1}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(0, new Solution_1512().numIdenticalPairs(new int[]{1, 2, 3}));
  }

}