package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Solution_125Test {

  @ParameterizedTest
  @ValueSource(strings = {
      "A man, a plan, a canal: Panama",
      "cattac"
  })
  public void testPositive_whenSolution1(String str) {
    Assertions.assertTrue(new Solution_125().isPalindrome(str));
  }

  @ParameterizedTest
  @ValueSource(strings = {
      "race a car",
      "cattacdjfklsfjk"
  })
  public void testNegative_whenSolution1(String str) {
    Assertions.assertFalse(new Solution_125().isPalindrome(str));
  }
}