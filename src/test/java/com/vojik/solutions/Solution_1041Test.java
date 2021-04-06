package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_1041Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertTrue(new Solution_1041().isRobotBounded("GGLLGG"));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertFalse(new Solution_1041().isRobotBounded("GG"));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertTrue(new Solution_1041().isRobotBounded("GL"));
  }

}