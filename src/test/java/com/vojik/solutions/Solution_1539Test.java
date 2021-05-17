package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1539Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(9, new Solution_1539().findKthPositive(new int[] {2, 3, 4, 7, 11}, 5));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(6, new Solution_1539().findKthPositive(new int[] {1, 2, 3, 4}, 2));
  }

  @Test
  public void test1_whenSolution2() {
    assertEquals(9, new Solution_1539().findKthPositive2(new int[] {2, 3, 4, 7, 11}, 5));
  }

  @Test
  public void test2_whenSolution2() {
    assertEquals(6, new Solution_1539().findKthPositive2(new int[] {1, 2, 3, 4}, 2));
  }
}
