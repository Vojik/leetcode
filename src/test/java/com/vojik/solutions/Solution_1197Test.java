package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1197Test {

  @Test
  public void test_whenSolution1() {
    assertEquals(1, new Solution_1197().minKnightMoves(2, 1));
    assertEquals(4, new Solution_1197().minKnightMoves(5, 5));
    assertEquals(56, new Solution_1197().minKnightMoves(2, 112));
    assertEquals(0, new Solution_1197().minKnightMoves(0, 0));
    assertEquals(2, new Solution_1197().minKnightMoves(2, 4));
    assertEquals(150, new Solution_1197().minKnightMoves(0, -300));
  }
}