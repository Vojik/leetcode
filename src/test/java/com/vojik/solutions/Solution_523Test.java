package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_523Test {

  @Test
  public void test1_whenSolution1() {
    assertTrue(new Solution_523().checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6));
  }

  @Test
  public void test2_whenSolution1() {
    assertTrue(new Solution_523().checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 6));
  }

  @Test
  public void test3_whenSolution1() {
    assertFalse(new Solution_523().checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 13));
  }

  @Test
  public void test4_whenSolution1() {
    assertTrue(new Solution_523().checkSubarraySum(new int[]{5, 0, 0, 0}, 3));
  }

  @Test
  public void test5_whenSolution1() {
    assertFalse(new Solution_523().checkSubarraySum(new int[]{0}, 1));
  }

  @Test
  public void test6_whenSolution1() {
    assertFalse(new Solution_523().checkSubarraySum(new int[]{0, 1, 0, 3, 0, 4, 0, 4, 0}, 5));
  }

  @Test
  public void test7_whenSolution1() {
    assertTrue(new Solution_523().checkSubarraySum(new int[]{1, 2, 3}, 5));
  }

  @Test
  public void test8_whenSolution1() {
    assertFalse(new Solution_523().checkSubarraySum(new int[]{5, 2, 4}, 5));
  }
}
