package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_2185Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(2,
        new Solution_2185().prefixCount(new String[] {"pay", "attention", "practice", "attend"},
            "at"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(0,
        new Solution_2185().prefixCount(new String[] {"leetcode", "win", "loops", "success"},
            "code"));
  }

}