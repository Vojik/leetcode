package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_1299Test {

  @Test
  public void test1_whenSolution1() {
    Solution_1299 solution = new Solution_1299();
    int[] actual = solution.replaceElements(new int[]{17, 18, 5, 4, 6, 1});
    Assertions.assertArrayEquals(new int[]{18, 6, 6, 6, 1, -1}, actual);
  }

  @Test
  public void test2_whenSolution1() {
    Solution_1299 solution = new Solution_1299();
    int[] actual = solution.replaceElements(new int[]{17});
    Assertions.assertArrayEquals(new int[]{-1}, actual);
  }

}