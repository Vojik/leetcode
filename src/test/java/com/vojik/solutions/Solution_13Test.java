package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_13Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(3, new Solution_13().romanToInt("III"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(4, new Solution_13().romanToInt("IV"));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(9, new Solution_13().romanToInt("IX"));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals(58, new Solution_13().romanToInt("LVIII"));
  }

  @Test
  public void test5_whenSolution1() {
    assertEquals(1994, new Solution_13().romanToInt("MCMXCIV"));
  }
}