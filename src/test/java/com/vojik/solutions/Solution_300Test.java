package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_300Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(
        4, new Solution_300().lengthOfLIS(new int[] {10, 9, 2, 5, 3, 7, 101, 18}));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(4, new Solution_300().lengthOfLIS(new int[] {0, 1, 0, 3, 2, 3}));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertEquals(1, new Solution_300().lengthOfLIS(new int[] {7, 7, 7, 7, 7, 7, 7}));
  }
}
