package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_743Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(2,
        new Solution_743().networkDelayTime(new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}}, 4, 2));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(1, new Solution_743().networkDelayTime(new int[][]{{1, 2, 1}}, 2, 1));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(-1, new Solution_743().networkDelayTime(new int[][]{{1, 2, 1}}, 2, 2));
  }
}