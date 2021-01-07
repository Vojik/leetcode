package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_542Test {

  @Test
  public void test1_whenSolution1() {
    // given
    Solution_542 solution = new Solution_542();
    int[][] input = new int[][]{
        {0, 0, 0},
        {0, 1, 0},
        {1, 1, 1}
    };

    // when
    int[][] actual = solution.updateMatrix(input);

    // then
    int[][] expected = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 2, 1}};
    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  public void test2_whenSolution1() {
    // given
    Solution_542 solution = new Solution_542();
    int[][] input = new int[][]{
        {0, 0, 0},
        {0, 1, 0},
        {0, 0, 0}
    };

    // when
    int[][] actual = solution.updateMatrix(input);

    // then
    int[][] expected = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  public void test3_whenSolution1() {
    // given
    Solution_542 solution = new Solution_542();
    int[][] input = new int[][]{
        {0, 1, 1},
        {1, 1, 1},
        {1, 1, 1}
    };

    // when
    int[][] actual = solution.updateMatrix(input);

    // then
    int[][] expected = new int[][]{{0, 1, 2}, {1, 2, 3}, {2, 3, 4}};
    Assertions.assertArrayEquals(expected, actual);
  }

}