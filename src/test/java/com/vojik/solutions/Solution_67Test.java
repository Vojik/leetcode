package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_67Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals("100", new Solution_67().addBinary("11", "1"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals("10101", new Solution_67().addBinary("1010", "1011"));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals("101110", new Solution_67().addBinary("1111", "11111"));
  }

}