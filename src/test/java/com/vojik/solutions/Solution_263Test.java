package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_263Test {

  @Test
  public void test1_whenSolution1() {
    assertTrue(new Solution_263().isUgly(6));
  }

  @Test
  public void test2_whenSolution1() {
    assertTrue(new Solution_263().isUgly(8));
  }

  @Test
  public void test3_whenSolution1() {
    assertFalse(new Solution_263().isUgly(14));
  }

  @Test
  public void test4_whenSolution1() {
    assertTrue(new Solution_263().isUgly(1));
  }
}
