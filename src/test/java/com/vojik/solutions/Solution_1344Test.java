package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_1344Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(165.0, new Solution_1344().angleClock(12, 30));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(75.0, new Solution_1344().angleClock(3, 30));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertEquals(7.5, new Solution_1344().angleClock(3, 15));
  }

}