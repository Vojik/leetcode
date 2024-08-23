package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_540Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(2, new Solution_540().singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(10, new Solution_540().singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(1, new Solution_540().singleNonDuplicate(new int[]{1}));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals(2, new Solution_540().singleNonDuplicate(new int[]{1, 1, 2}));
  }

  @Test
  public void test5_whenSolution1() {
    assertEquals(13,
        new Solution_540().singleNonDuplicate(new int[]{3, 3, 7, 7, 11, 11, 12, 12, 13}));
  }

  @Test
  public void test6_whenSolution1() {
    assertEquals(2, new Solution_540().singleNonDuplicate(new int[]{1, 1, 2, 3, 3}));
  }
}