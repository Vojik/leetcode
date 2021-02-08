package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_821Test {

  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0},
        new Solution_821().shortestToChar("loveleetcode", 'e'));
  }

  @Test
  public void test2_whenSolution1() {
    assertArrayEquals(new int[]{3, 2, 1, 0},
        new Solution_821().shortestToChar("aaab", 'b'));
  }

}