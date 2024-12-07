package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_433Test {

  @Test
  public void test1_whenSolution() {
    assertEquals(1,
        new Solution_433().minMutation("AACCGGTT", "AACCGGTA", new String[]{"AACCGGTA"}));
  }

  @Test
  public void test2_whenSolution() {
    assertEquals(2,
        new Solution_433().minMutation("AACCGGTT", "AAACGGTA",
            new String[]{"AACCGGTA", "AACCGCTA", "AAACGGTA"}));
  }

}