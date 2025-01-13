package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_273Test {

  @Test
  public void tests_whenSolution1() {
    assertEquals("One Hundred Twenty Three", new Solution_273().numberToWords(123));
    assertEquals("One Thousand Two Hundred Thirty Four", new Solution_273().numberToWords(1234));
    assertEquals("Twelve Thousand Three Hundred Forty Five",
        new Solution_273().numberToWords(12345));
    assertEquals("One Hundred Twenty Three Thousand Four Hundred Fifty Six",
        new Solution_273().numberToWords(123456));
    assertEquals("One Hundred", new Solution_273().numberToWords(100));
    assertEquals(
        "Two Billion One Hundred Forty Seven Million Four Hundred Eighty Three Thousand Six Hundred Forty Seven",
        new Solution_273().numberToWords(2147483647));
  }

  @Test
  public void tests_whenSolution2() {
    assertEquals("One Hundred Twenty Three", new Solution_273().numberToWords2(123));
    assertEquals("One Thousand Two Hundred Thirty Four", new Solution_273().numberToWords2(1234));
    assertEquals("Twelve Thousand Three Hundred Forty Five",
        new Solution_273().numberToWords2(12345));
    assertEquals("One Hundred Twenty Three Thousand Four Hundred Fifty Six",
        new Solution_273().numberToWords2(123456));
    assertEquals("One Hundred", new Solution_273().numberToWords2(100));
    assertEquals(
        "Two Billion One Hundred Forty Seven Million Four Hundred Eighty Three Thousand Six Hundred Forty Seven",
        new Solution_273().numberToWords2(2147483647));
  }

}