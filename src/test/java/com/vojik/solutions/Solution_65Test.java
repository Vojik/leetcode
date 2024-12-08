package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_65Test {

  @Test
  public void test1_whenSolution1() {
    assertTrue(new Solution_65().isNumber("2"));
    assertTrue(new Solution_65().isNumber("0089"));
    assertTrue(new Solution_65().isNumber("-0.1"));
    assertTrue(new Solution_65().isNumber("+3.14"));
    assertTrue(new Solution_65().isNumber("4."));
    assertTrue(new Solution_65().isNumber("-.9"));
    assertTrue(new Solution_65().isNumber("2e10"));
    assertTrue(new Solution_65().isNumber("-90E3"));
    assertTrue(new Solution_65().isNumber("3e+7"));
    assertTrue(new Solution_65().isNumber("+6e-1"));
    assertTrue(new Solution_65().isNumber("53.5e93"));
    assertTrue(new Solution_65().isNumber("-123.456e789"));
  }

  @Test
  public void test2_whenSolution1() {
    assertFalse(new Solution_65().isNumber("abc"));
    assertFalse(new Solution_65().isNumber("1a"));
    assertFalse(new Solution_65().isNumber("1e"));
    assertFalse(new Solution_65().isNumber("e3"));
    assertFalse(new Solution_65().isNumber("99e2.5"));
    assertFalse(new Solution_65().isNumber("--6"));
    assertFalse(new Solution_65().isNumber("-+3"));
    assertFalse(new Solution_65().isNumber("95a54e53"));
    assertFalse(new Solution_65().isNumber("+ "));
    assertFalse(new Solution_65().isNumber("."));
    assertFalse(new Solution_65().isNumber("e"));
  }
}