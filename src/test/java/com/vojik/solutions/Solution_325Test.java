package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_325Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(
        4, new Solution_325().maxSubArrayLen(new int[]{1, -1, 5, -2, 3}, 3));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(
        2, new Solution_325().maxSubArrayLen(new int[]{-2, -1, 2, 1}, 1));
  }

}