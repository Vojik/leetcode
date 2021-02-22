package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_991Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(2, new Solution_991().brokenCalc(2, 3));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(2, new Solution_991().brokenCalc(5, 8));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(3, new Solution_991().brokenCalc(3, 10));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals(1023, new Solution_991().brokenCalc(1024, 1));
  }
}