package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_1400Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertTrue(new Solution_1400().canConstruct("annabelle", 2));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertFalse(new Solution_1400().canConstruct("leetcode", 3));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertTrue(new Solution_1400().canConstruct("true", 4));
  }

}