package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_243Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(
        3,
        new Solution_243()
            .shortestDistance(
                new String[] {"practice", "makes", "perfect", "coding", "makes"},
                "coding",
                "practice"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(
        1,
        new Solution_243()
            .shortestDistance(
                new String[] {"practice", "makes", "perfect", "coding", "makes"},
                "makes",
                "coding"));
  }
}
