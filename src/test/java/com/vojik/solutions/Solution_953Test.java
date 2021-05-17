package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_953Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertTrue(
        new Solution_953()
            .isAlienSorted(new String[] {"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertFalse(
        new Solution_953()
            .isAlienSorted(new String[] {"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz"));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertFalse(
        new Solution_953()
            .isAlienSorted(new String[] {"apple", "app"}, "abcdefghijklmnopqrstuvwxyz"));
  }
}
