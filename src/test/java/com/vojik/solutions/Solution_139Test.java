package com.vojik.solutions;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_139Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertTrue(new Solution_139().wordBreak("leetcode", List.of("leet", "code")));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertTrue(new Solution_139().wordBreak("applepenapple", List.of("apple", "pen")));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertFalse(
        new Solution_139().wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
  }
}
