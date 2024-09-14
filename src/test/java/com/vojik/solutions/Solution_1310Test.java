package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_1310Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertArrayEquals(
        new int[]{2, 7, 14, 8}, new Solution_1310().xorQueries(new int[]{1, 3, 4, 8},
            new int[][]{{0, 1}, {1, 2}, {0, 3}, {3, 3}}));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertArrayEquals(
        new int[]{8, 0, 4, 4}, new Solution_1310().xorQueries(new int[]{4, 8, 2, 10},
            new int[][]{{2, 3}, {1, 3}, {0, 0}, {0, 3}}));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertArrayEquals(
        new int[]{16, 16, 16}, new Solution_1310().xorQueries(new int[]{16},
            new int[][]{{0, 0}, {0, 0}, {0, 0}}));
  }


  @Test
  public void test1_whenSolution2() {
    Assertions.assertArrayEquals(
        new int[]{2, 7, 14, 8}, new Solution_1310().xorQueries2(new int[]{1, 3, 4, 8},
            new int[][]{{0, 1}, {1, 2}, {0, 3}, {3, 3}}));
  }

  @Test
  public void test2_whenSolution2() {
    Assertions.assertArrayEquals(
        new int[]{8, 0, 4, 4}, new Solution_1310().xorQueries2(new int[]{4, 8, 2, 10},
            new int[][]{{2, 3}, {1, 3}, {0, 0}, {0, 3}}));
  }

  @Test
  public void test3_whenSolution2() {
    Assertions.assertArrayEquals(
        new int[]{16, 16, 16}, new Solution_1310().xorQueries2(new int[]{16},
            new int[][]{{0, 0}, {0, 0}, {0, 0}}));
  }

}