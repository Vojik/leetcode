package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_1342Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(6, new Solution_1342().numberOfSteps(14));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(4, new Solution_1342().numberOfSteps(8));
  }
}