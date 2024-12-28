package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_2352Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(1, new Solution_2352().equalPairs(new int[][]{{3, 2, 1}, {1, 7, 6}, {2, 7, 7}}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(3, new Solution_2352().equalPairs(
        new int[][]{{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}}));
  }
}