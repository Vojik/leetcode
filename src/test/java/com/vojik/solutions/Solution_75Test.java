package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_75Test {

  @Test
  public void test1_whenSolution1() {
    int[] input = new int[] {2, 0, 2, 1, 1, 0};
    int[] expected = new int[] {0, 0, 1, 1, 2, 2};
    new Solution_75().sortColors(input);
    assertArrayEquals(expected, input);
  }
}
