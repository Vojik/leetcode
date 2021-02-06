package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_189Test {

  @Test
  public void test1_whenSolution1() {
    final int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
    new Solution_189().rotate(input, 3);
    Assertions.assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, input);
  }

  @Test
  public void test2_whenSolution1() {
    int[] input = new int[]{-1, -100, 3, 99};
    new Solution_189().rotate(input, 2);
    Assertions.assertArrayEquals(new int[]{3, 99, -1, -100}, input);
  }
}