package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_503Test {

  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(new int[] {2, -1, 2},
        new Solution_503().nextGreaterElements(new int[] {1, 2, 1}));
    assertArrayEquals(new int[] {2, 3, 4, -1, 4},
        new Solution_503().nextGreaterElements(new int[] {1, 2, 3, 4, 3}));
    assertArrayEquals(new int[] {-1, 5, 5, 5, 5},
        new Solution_503().nextGreaterElements(new int[] {5, 4, 3, 2, 1}));
    assertArrayEquals(new int[] {-1, 3, 1, 3},
        new Solution_503().nextGreaterElements(new int[] {3, 1, 0, 1}));
  }

  @Test
  public void test1_whenSolution2() {
    assertArrayEquals(new int[] {2, -1, 2},
        new Solution_503().nextGreaterElements2(new int[] {1, 2, 1}));
    assertArrayEquals(new int[] {2, 3, 4, -1, 4},
        new Solution_503().nextGreaterElements2(new int[] {1, 2, 3, 4, 3}));
    assertArrayEquals(new int[] {-1, 5, 5, 5, 5},
        new Solution_503().nextGreaterElements2(new int[] {5, 4, 3, 2, 1}));
    assertArrayEquals(new int[] {-1, 3, 1, 3},
        new Solution_503().nextGreaterElements2(new int[] {3, 1, 0, 1}));
  }

}