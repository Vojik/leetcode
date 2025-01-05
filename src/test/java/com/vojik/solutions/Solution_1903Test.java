package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1903Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals("5", new Solution_1903().largestOddNumber("52"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals("", new Solution_1903().largestOddNumber("4206"));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals("35427", new Solution_1903().largestOddNumber("35427"));
  }

}