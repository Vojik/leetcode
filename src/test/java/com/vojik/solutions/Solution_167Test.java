package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_167Test {

  @Test
  public void test1_whenSolution1() {
    Assertions
        .assertArrayEquals(new int[]{1, 2}, new Solution_167().twoSum(new int[]{2, 7, 11, 15}, 9));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions
        .assertArrayEquals(new int[]{1, 3}, new Solution_167().twoSum(new int[]{2, 3, 4}, 6));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions
        .assertArrayEquals(new int[]{1, 2}, new Solution_167().twoSum(new int[]{-1, 0}, -1));
  }
}