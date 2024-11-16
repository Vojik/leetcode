package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_670Test {

  @Test
  public void test_whenSolution1() {
    assertEquals(7236, new Solution_670().maximumSwap(2736));
    assertEquals(9973, new Solution_670().maximumSwap(9973));
    assertEquals(7763, new Solution_670().maximumSwap(7736));
    assertEquals(71721, new Solution_670().maximumSwap(21771));
    assertEquals(9913, new Solution_670().maximumSwap(1993));
    assertEquals(98863, new Solution_670().maximumSwap(98368));
  }
}