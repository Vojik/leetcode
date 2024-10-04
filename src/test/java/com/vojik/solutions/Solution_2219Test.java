package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_2219Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(10, new Solution_2219().maximumSumScore(new int[]{4, 3, -2, 5}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(-3, new Solution_2219().maximumSumScore(new int[]{-3, -5}));
  }

}