package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Solution_657Test {

  @ParameterizedTest
  @ValueSource(strings = {
      "UD",
      "RDUL"
  })
  public void testPositive_whenSolution1(String moves) {
    Assertions.assertTrue(new Solution_657().judgeCircle(moves));
  }

  @ParameterizedTest
  @ValueSource(strings = {
      "LL",
      "RRDD",
      "LDRRLRUULR"
  })
  public void testNegative_whenSolution1(String moves) {
    Assertions.assertFalse(new Solution_657().judgeCircle(moves));
  }

}