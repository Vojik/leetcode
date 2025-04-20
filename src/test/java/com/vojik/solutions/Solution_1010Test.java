package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_1010Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(3,
        new Solution_1010().numPairsDivisibleBy60(new int[]{30, 20, 150, 100, 40}));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(3,
        new Solution_1010().numPairsDivisibleBy60(new int[]{60,60,60}));
  }
}