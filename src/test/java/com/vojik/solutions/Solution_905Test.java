package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_905Test {

  @Test
  public void test1_whenSolution1() {
    Solution_905 solution = new Solution_905();
    int[] actual = solution.sortArrayByParity(new int[]{2, 1});
    Assertions.assertArrayEquals(new int[]{2, 1}, actual);
  }

  @Test
  public void test2_whenSolution1() {
    Solution_905 solution = new Solution_905();
    int[] actual = solution.sortArrayByParity(new int[]{3, 1, 2, 4});
    Assertions.assertArrayEquals(new int[]{4, 2, 1, 3}, actual);
  }


}