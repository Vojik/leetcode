package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_1046Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(1, new Solution_1046().lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(1, new Solution_1046().lastStoneWeight(new int[]{1}));
  }
}