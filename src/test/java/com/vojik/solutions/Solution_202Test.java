package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_202Test {

  @Test
  public void test1_whenSolution1() {
    assertTrue(new Solution_202().isHappy(19));
  }

  @Test
  public void test2_whenSolution1() {
    assertFalse(new Solution_202().isHappy(2));
  }

}