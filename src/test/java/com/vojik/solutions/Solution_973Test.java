package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_973Test {

  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(new int[][]{{-2, 2}},
        new Solution_973().kClosest(new int[][]{{1, 3}, {-2, 2}}, 1));
  }

  @Test
  public void test2_whenSolution1() {
    assertArrayEquals(new int[][]{{3, 3}, {-2, 4}},
        new Solution_973().kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2));
  }
}