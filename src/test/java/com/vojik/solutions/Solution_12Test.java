package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_12Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals("III", new Solution_12().intToRoman(3));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals("IV", new Solution_12().intToRoman(4));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals("IX", new Solution_12().intToRoman(9));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals("LVIII", new Solution_12().intToRoman(58));
  }

  @Test
  public void test5_whenSolution1() {
    assertEquals("MCMXCIV", new Solution_12().intToRoman(1994));
  }

}