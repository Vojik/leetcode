package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_645Test {

  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(new int[]{2, 3},
        new Solution_645().findErrorNums(new int[]{1, 2, 2, 4}));
  }

  @Test
  public void test2_whenSolution1() {
    assertArrayEquals(new int[]{1, 2},
        new Solution_645().findErrorNums(new int[]{1, 1}));
  }


}