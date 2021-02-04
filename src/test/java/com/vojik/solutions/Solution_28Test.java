package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_28Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(2, new Solution_28().strStr("hello", "ll"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(0, new Solution_28().strStr("a", "a"));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(0, new Solution_28().strStr("a", ""));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals(-1, new Solution_28().strStr("asdsd", "ddd"));
  }

}