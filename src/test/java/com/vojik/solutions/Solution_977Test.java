package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_977Test {

  @Test
  public void test1_whenSolution1() {
    // given
    Solution_977 solution = new Solution_977();

    // when
    int[] actual = solution.sortedSquares(new int[]{-4, -1, 0, 3, 10});

    // then
    Assertions.assertArrayEquals(new int[]{0, 1, 9, 16, 100}, actual);
  }

  @Test
  public void test2_whenSolution1() {
    Solution_977 solution = new Solution_977();
    int[] actual = solution.sortedSquares(new int[]{-7, -3, 2, 3, 11});
    Assertions.assertArrayEquals(new int[]{4, 9, 9, 49, 121}, actual);
  }

  @Test
  public void test3_whenSolution1() {
    Solution_977 solution = new Solution_977();
    int[] actual = solution.sortedSquares(new int[]{-10000, -10000, 10000, 10000, 10000});
    Assertions.assertArrayEquals(new int[]{100000000, 100000000, 100000000, 100000000, 100000000},
        actual);
  }

  @Test
  public void test4_whenSolution1() {
    Solution_977 solution = new Solution_977();
    int[] actual = solution.sortedSquares(new int[]{-10000});
    Assertions.assertArrayEquals(new int[]{100000000}, actual);
  }

}