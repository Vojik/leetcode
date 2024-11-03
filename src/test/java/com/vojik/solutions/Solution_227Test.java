package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_227Test {

  @Test
  public void test_whenSolution1() {
    assertEquals(7, new Solution_227().calculate("3+2*2"));
    assertEquals(1, new Solution_227().calculate(" 3/2 "));
    assertEquals(5, new Solution_227().calculate(" 3+5 / 2 "));
    assertEquals(42, new Solution_227().calculate("42"));
  }

}