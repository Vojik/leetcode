package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_1641Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(15, new Solution_1641().countVowelStrings(2));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(5, new Solution_1641().countVowelStrings(1));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(316251, new Solution_1641().countVowelStrings(50));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals(35, new Solution_1641().countVowelStrings(3));
  }

}