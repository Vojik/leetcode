package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Solution_733Test {

  @Test
  public void test1_whenSolution1() {
    Solution_733 solution = new Solution_733();
    int[][] actual = solution.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2);
    assertArrayEquals(new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}}, actual);
  }
}