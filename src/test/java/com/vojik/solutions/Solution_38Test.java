package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_38Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals("1", new Solution_38().countAndSay(1));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals("1211", new Solution_38().countAndSay(4));
  }
}
