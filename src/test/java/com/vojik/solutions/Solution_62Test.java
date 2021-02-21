package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_62Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(28, new Solution_62().uniquePaths(3, 7));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(3, new Solution_62().uniquePaths(3, 2));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(6, new Solution_62().uniquePaths(3, 3));
  }
}