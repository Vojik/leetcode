package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_244Test {

  @Test
  public void test1_whenSolution1() {
    Solution_244 solution = new Solution_244(
        new String[] {"practice", "makes", "perfect", "coding", "makes"});
    assertEquals(3, solution.shortest("coding", "practice"));
    assertEquals(1, solution.shortest("makes", "coding"));
  }

}