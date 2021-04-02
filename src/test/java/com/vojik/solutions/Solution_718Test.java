package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_718Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(3,
        new Solution_718().findLength(new int[]{1, 2, 3, 2, 1}, new int[]{3, 2, 1, 4, 7}));
  }

  @Test
  public void test1_whenSolution2() {
    assertEquals(3,
        new Solution_718().findLengthDP(new int[]{1, 2, 3, 2, 1}, new int[]{3, 2, 1, 4, 7}));
  }


}