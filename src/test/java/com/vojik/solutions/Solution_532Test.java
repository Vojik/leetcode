package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_532Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(
        2, new Solution_532().findPairs(new int[]{3, 1, 4, 1, 5}, 2));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(
        4, new Solution_532().findPairs(new int[]{1, 2, 3, 4, 5}, 1));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(
        1, new Solution_532().findPairs(new int[]{1, 3, 1, 5, 4}, 0));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals(
        1, new Solution_532().findPairs(new int[]{1, 1, 1, 1, 1}, 0));
  }

}