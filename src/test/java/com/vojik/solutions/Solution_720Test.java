package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_720Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(
        "world", new Solution_720().longestWord(new String[] {"w", "wo", "wor", "worl", "world"}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(
        "apple",
        new Solution_720()
            .longestWord(new String[] {"a", "banana", "app", "appl", "ap", "apply", "apple"}));
  }
}
