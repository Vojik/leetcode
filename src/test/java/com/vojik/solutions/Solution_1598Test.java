package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_1598Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(
        2, new Solution_1598().minOperations(new String[] {"d1/", "d2/", "../", "d21/", "./"}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(
        3,
        new Solution_1598().minOperations(new String[] {"d1/", "d2/", "./", "d3/", "../", "d31/"}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(0, new Solution_1598().minOperations(new String[] {"d1/", "../", "../", "../"}));
  }
}
