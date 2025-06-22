package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1297Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(2, new Solution_1297().maxFreq("aababcaab", 2, 3, 4));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(2, new Solution_1297().maxFreq("aaaa", 1, 3, 3));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(3, new Solution_1297().maxFreq("aabcabcab", 2, 2, 3));
  }
}