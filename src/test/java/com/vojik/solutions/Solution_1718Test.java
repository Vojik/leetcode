package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_1718Test {


  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(new int[]{3, 1, 2, 3, 2}, new Solution_1718().constructDistancedSequence(3));
  }

  @Test
  public void test2_whenSolution1() {
    assertArrayEquals(new int[]{4, 2, 3, 2, 4, 3, 1},
        new Solution_1718().constructDistancedSequence(4));
  }

  @Test
  public void test3_whenSolution1() {
    assertArrayEquals(new int[]{5, 3, 1, 4, 3, 5, 2, 4, 2},
        new Solution_1718().constructDistancedSequence(5));
  }
}