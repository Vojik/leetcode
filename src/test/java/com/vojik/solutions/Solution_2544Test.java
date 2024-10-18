package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_2544Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(4, new Solution_2544().alternateDigitSum(521));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(0, new Solution_2544().alternateDigitSum(886996));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(1, new Solution_2544().alternateDigitSum(111));
  }

}