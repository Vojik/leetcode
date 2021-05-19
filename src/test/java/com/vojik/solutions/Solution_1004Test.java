package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_1004Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(
        6, new Solution_1004().longestOnes(new int[] {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(
        10,
        new Solution_1004()
            .longestOnes(new int[] {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
  }
}
