package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_6Test {

  @Test
  public void tests_forSolution1() {
    assertEquals("PAHNAPLSIIGYIR", new Solution_6().convert("PAYPALISHIRING", 3));
    assertEquals("PINALSIGYAHRPI", new Solution_6().convert("PAYPALISHIRING", 4));
    assertEquals("A", new Solution_6().convert("A", 1));
    assertEquals("AB", new Solution_6().convert("AB", 1));
  }

  @Test
  public void tests_forSolution2() {
    assertEquals("PAHNAPLSIIGYIR", new Solution_6_Kotlin().convert("PAYPALISHIRING", 3));
    assertEquals("PINALSIGYAHRPI", new Solution_6_Kotlin().convert("PAYPALISHIRING", 4));
    assertEquals("A", new Solution_6_Kotlin().convert("A", 1));
    assertEquals("AB", new Solution_6_Kotlin().convert("AB", 1));
  }

}