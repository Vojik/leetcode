package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1710Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(8, new Solution_1710().maximumUnits(new int[][]{{1, 3}, {2, 2}, {3, 1}}, 4));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(91,
        new Solution_1710().maximumUnits(new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}}, 10));
  }
}