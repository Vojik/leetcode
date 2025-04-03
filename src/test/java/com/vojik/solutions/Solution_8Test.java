package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_8Test {

  @Test
  public void tests_forSolution1() {
    assertEquals(42, new Solution_8().myAtoi("42"));
    assertEquals(-42, new Solution_8().myAtoi("   -042"));
    assertEquals(1337, new Solution_8().myAtoi("1337c0d3"));
    assertEquals(0, new Solution_8().myAtoi("0-1"));
    assertEquals(0, new Solution_8().myAtoi("words and 987"));
    assertEquals(2147483647, new Solution_8().myAtoi("9223372036854775808"));
    assertEquals(0, new Solution_8().myAtoi("-+12"));
    assertEquals(2147483647, new Solution_8().myAtoi("2147483649"));
  }

}