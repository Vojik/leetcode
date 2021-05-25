package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_523Test {

  @Test
  public void test1_whenSolution1() {
    assertTrue(new Solution_523().checkSubarraySum(new int[] {23, 2, 4, 6, 7}, 6));
  }

  @Test
  public void test2_whenSolution1() {
    assertTrue(new Solution_523().checkSubarraySum(new int[] {23, 2, 6, 4, 7}, 6));
  }

  @Test
  public void test3_whenSolution1() {
    assertFalse(new Solution_523().checkSubarraySum(new int[] {23, 2, 6, 4, 7}, 13));
  }

  @Test
  public void test4_whenSolution1() {
    assertTrue(new Solution_523().checkSubarraySum(new int[] {5, 0, 0, 0}, 3));
  }
}
