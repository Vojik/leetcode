package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_3174Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals("abc", new Solution_3174().clearDigits("abc"));
    assertEquals("", new Solution_3174().clearDigits("cb34"));
    assertEquals("", new Solution_3174().clearDigits("g0"));
  }
}