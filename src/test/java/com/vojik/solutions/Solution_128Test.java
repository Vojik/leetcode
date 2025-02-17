package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_128Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(4, new Solution_128().longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(9,
        new Solution_128().longestConsecutive(new int[] {0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(3, new Solution_128().longestConsecutive(new int[] {1, 0, 1, 2}));
  }

}