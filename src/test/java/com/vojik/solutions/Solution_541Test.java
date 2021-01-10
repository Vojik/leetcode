package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_541Test {

  @Test
  public void test1_whenSolution1() {
    String actual = new Solution_541().reverseStr("abcdefg", 2);
    Assertions.assertEquals("bacdfeg", actual);
  }
}