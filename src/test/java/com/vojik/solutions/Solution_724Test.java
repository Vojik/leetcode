package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_724Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(3, new Solution_724().pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(-1, new Solution_724().pivotIndex(new int[]{1, 2, 3}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(0, new Solution_724().pivotIndex(new int[]{2, 1, -1}));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals(3, new Solution_724().pivotIndex(new int[]{-1, -1, -1, -1, -1, -1, -1}));
  }

  @Test
  public void test5_whenSolution1() {
    assertEquals(-1, new Solution_724().pivotIndex(new int[]{-1, -1, -1, -1, -1, -1}));
  }
}