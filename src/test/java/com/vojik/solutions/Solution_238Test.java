package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_238Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertArrayEquals(new int[]{24, 12, 8, 6},
        new Solution_238().productExceptSelf(new int[]{1, 2, 3, 4}));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertArrayEquals(new int[]{0, 0, 9, 0, 0},
        new Solution_238().productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
  }

  /////////////////////
  @Test
  public void test1_whenSolution2() {
    Assertions.assertArrayEquals(new int[]{24, 12, 8, 6},
        new Solution_238().productExceptSelfFollowUp(new int[]{1, 2, 3, 4}));
  }

  @Test
  public void test2_whenSolution2() {
    Assertions.assertArrayEquals(new int[]{0, 0, 9, 0, 0},
        new Solution_238().productExceptSelfFollowUp(new int[]{-1, 1, 0, -3, 3}));
  }

}