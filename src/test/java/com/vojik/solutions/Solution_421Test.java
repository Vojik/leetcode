package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_421Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(28, new Solution_421().findMaximumXOR(new int[]{3, 10, 5, 25, 2, 8}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(0, new Solution_421().findMaximumXOR(new int[]{0}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(6, new Solution_421().findMaximumXOR(new int[]{2, 4}));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals(10, new Solution_421().findMaximumXOR(new int[]{8, 10, 2}));
  }

  @Test
  public void test5_whenSolution1() {
    assertEquals(127, new Solution_421()
        .findMaximumXOR(new int[]{14, 70, 53, 83, 49, 91, 36, 80, 92, 51, 66, 70}));
  }
}