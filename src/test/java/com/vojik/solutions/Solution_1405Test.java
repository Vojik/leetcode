package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1405Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals("ccaccbcc", new Solution_1405().longestDiverseString(1, 1, 7));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals("aabbc", new Solution_1405().longestDiverseString(2, 2, 1));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals("aabaa", new Solution_1405().longestDiverseString(7, 1, 0));
  }
}
