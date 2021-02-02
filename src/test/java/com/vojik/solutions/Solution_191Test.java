package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_191Test {

  @Test
  public void test1_whenSolution1() {
    // 00000000000000000000000000001011
    Assertions.assertEquals(3, new Solution_191().hammingWeight(11));
  }

  @Test
  public void test2_whenSolution1() {
    // 00000000000000000000000010000000
    Assertions.assertEquals(1, new Solution_191().hammingWeight(128));
  }

  @Test
  public void test3_whenSolution1() {
    // 11111111111111111111111111111101
    Assertions.assertEquals(31, new Solution_191().hammingWeight(-3));
  }

}