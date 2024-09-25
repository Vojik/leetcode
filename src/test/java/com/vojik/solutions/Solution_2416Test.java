package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_2416Test {

  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(new int[]{5, 4, 3, 2},
        new Solution_2416().sumPrefixScores(new String[]{"abc", "ab", "bc", "b"}));
  }

  @Test
  public void test2_whenSolution1() {
    assertArrayEquals(new int[]{4},
        new Solution_2416().sumPrefixScores(new String[]{"abcd"}));
  }
}