package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1593Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(5, new Solution_1593().maxUniqueSplit("ababccc"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(2, new Solution_1593().maxUniqueSplit("aba"));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(1, new Solution_1593().maxUniqueSplit("aa"));
  }
}
