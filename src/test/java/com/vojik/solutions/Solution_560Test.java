package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_560Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(2, new Solution_560().subarraySum(new int[] {1, 1, 1}, 2));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(2, new Solution_560().subarraySum(new int[] {1, 2, 3}, 3));
  }

  @Test
  public void test1_whenSolution2() {
    assertEquals(2, new Solution_560().subarraySum2(new int[] {1, 1, 1}, 2));
  }

  @Test
  public void test2_whenSolution2() {
    assertEquals(2, new Solution_560().subarraySum2(new int[] {1, 2, 3}, 3));
  }
}
