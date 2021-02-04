package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_14Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals("fl",
        new Solution_14().longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals("", new Solution_14().longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals("a", new Solution_14().longestCommonPrefix(new String[]{"a"}));
  }
}