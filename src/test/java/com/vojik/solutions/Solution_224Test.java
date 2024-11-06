package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_224Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(2, new Solution_224().calculate("1 + 1"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(3, new Solution_224().calculate(" 2-1 + 2 "));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(23, new Solution_224().calculate("(1+(4+5+2)-3)+(6+8)"));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals(42, new Solution_224().calculate("42"));
  }
}