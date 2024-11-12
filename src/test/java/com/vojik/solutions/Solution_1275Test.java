package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_1275Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals("A",
        new Solution_1275().tictactoe(new int[][]{{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}}));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals("B",
        new Solution_1275().tictactoe(new int[][]{{0, 0}, {1, 1}, {0, 1}, {0, 2}, {1, 0}, {2, 0}}));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertEquals("Draw",
        new Solution_1275().tictactoe(
            new int[][]{{0, 0}, {1, 1}, {2, 0}, {1, 0}, {1, 2}, {2, 1}, {0, 1}, {0, 2}, {2, 2}}));
  }

}