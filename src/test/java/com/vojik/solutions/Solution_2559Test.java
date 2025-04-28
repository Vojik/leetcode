package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_2559Test {

  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(
        new int[] {2, 3, 0},
        new Solution_2559().vowelStrings(
            new String[] {"aba", "bcb", "ece", "aa", "e"},
            new int[][] {{0, 2}, {1, 4}, {1, 1}}
        )
    );
  }

  @Test
  public void test2_whenSolution1() {
    assertArrayEquals(
        new int[] {3, 2, 1},
        new Solution_2559().vowelStrings(
            new String[] {"a", "e", "i"},
            new int[][] {{0, 2}, {0, 1}, {2, 2}}
        )
    );
  }
}