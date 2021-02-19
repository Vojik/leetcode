package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_413Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(3, new Solution_413().numberOfArithmeticSlices(new int[]{1, 2, 3, 4}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(6,
        new Solution_413().numberOfArithmeticSlices(new int[]{1, 2, 3, 4, 10, 15, 20, 25}));
  }


  ///////////////
  @Test
  public void test1_whenSolution2() {
    assertEquals(3, new Solution_413().numberOfArithmeticSlicesDP(new int[]{1, 2, 3, 4}));
  }

  @Test
  public void test2_whenSolution2() {
    assertEquals(6,
        new Solution_413().numberOfArithmeticSlicesDP(new int[]{1, 2, 3, 4, 10, 15, 20, 25}));
  }

  ///////////////
  @Test
  public void test1_whenSolution3() {
    assertEquals(3, new Solution_413().numberOfArithmeticSlicesDPOptimized(new int[]{1, 2, 3, 4}));
  }

  @Test
  public void test2_whenSolution4() {
    assertEquals(6,
        new Solution_413()
            .numberOfArithmeticSlicesDPOptimized(new int[]{1, 2, 3, 4, 10, 15, 20, 25}));
  }
}