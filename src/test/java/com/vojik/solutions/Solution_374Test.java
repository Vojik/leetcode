package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_374Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(6, new Solution_374(6).guessNumber(10));
    Assertions.assertEquals(1, new Solution_374(1).guessNumber(1));
    Assertions.assertEquals(1, new Solution_374(1).guessNumber(2));
    Assertions.assertEquals(6, new Solution_374(6).guessNumber(777777777));
    Assertions.assertEquals(1, new Solution_374(1).guessNumber(2147483647));
    Assertions.assertEquals(2147483647, new Solution_374(2147483647).guessNumber(2147483647));
  }

}