package com.vojik.solutions;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_692Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(
        List.of("i", "love"),
        new Solution_692()
            .topKFrequent(new String[] {"i", "love", "leetcode", "i", "love", "coding"}, 2));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(
        List.of("the", "is", "sunny", "day"),
        new Solution_692()
            .topKFrequent(
                new String[] {
                  "the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"
                },
                4));
  }
}
