package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_525Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(2, new Solution_525().findMaxLength(new int[] {0, 1, 0}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(2, new Solution_525().findMaxLength(new int[] {0, 1}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(
        10,
        new Solution_525()
            .findMaxLength(new int[] {0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0}));
  }
}
