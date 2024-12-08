package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_258Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(2, new Solution_258().addDigits(38));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(0, new Solution_258().addDigits(0));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(1, new Solution_258().addDigits(10));
  }

}