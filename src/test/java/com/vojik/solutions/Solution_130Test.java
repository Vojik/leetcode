package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_130Test {

  @Test
  public void test1_whenSolution1() {
    char[][] input =
        new char[][] {
          {'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}
        };
    new Solution_130().solve(input);
    Assertions.assertArrayEquals(
        new char[][] {
          {'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'O', 'X', 'X'}
        },
        input);
  }
}
