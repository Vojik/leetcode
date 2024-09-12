package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1684Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(2, new Solution_1684().countConsistentStrings("ab",
        new String[]{"ad", "bd", "aaab", "baa", "badab"}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(7, new Solution_1684().countConsistentStrings("abc",
        new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(4, new Solution_1684().countConsistentStrings("cad",
        new String[]{"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"}));
  }
}