package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_221Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(
        4,
        new Solution_221()
            .maximalSquare(
                new char[][] {
                  {'1', '0', '1', '0', '0'},
                  {'1', '0', '1', '1', '1'},
                  {'1', '1', '1', '1', '1'},
                  {'1', '0', '0', '1', '0'}
                }));
  }
}
