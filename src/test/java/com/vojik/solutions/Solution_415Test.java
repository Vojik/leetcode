package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_415Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals("134", new Solution_415().addStrings("11", "123"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals("533", new Solution_415().addStrings("456", "77"));
  }

}