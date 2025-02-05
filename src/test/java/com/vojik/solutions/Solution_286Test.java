package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_286Test {

  @Test
  public void test1_whenSolution1() {
    int[][] input = new int[][] {{2147483647, -1, 0, 2147483647},
        {2147483647, 2147483647, 2147483647, -1},
        {2147483647, -1, 2147483647, -1}, {0, -1, 2147483647, 2147483647}};

    new Solution_286().wallsAndGates(input);
    assertArrayEquals(new int[][] {{3, -1, 0, 1}, {2, 2, 1, -1}, {1, -1, 2, -1}, {0, -1, 3, 4}},
        input);
  }


  @Test
  public void test2_whenSolution1() {
    int[][] input = new int[][] {{-1}};

    new Solution_286().wallsAndGates(input);
    assertArrayEquals(new int[][] {{-1}}, input);
  }

}