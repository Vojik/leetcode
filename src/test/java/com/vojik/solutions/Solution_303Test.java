package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_303Test {

  @Test
  public void test1_whenSolution1() {
    Solution_303 solution = new Solution_303(new int[] {-2, 0, 3, -5, 2, -1});
    Assertions.assertEquals(1, solution.sumRange(0, 2));
    Assertions.assertEquals(-1, solution.sumRange(2, 5));
    Assertions.assertEquals(-3, solution.sumRange(0, 5));
  }

}