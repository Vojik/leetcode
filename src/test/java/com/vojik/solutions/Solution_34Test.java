package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_34Test {

  @Test
  public void test_whenSolution1() {
    assertArrayEquals(new int[]{3, 4},
        new Solution_34().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));

    assertArrayEquals(new int[]{-1, -1},
        new Solution_34().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6));

    assertArrayEquals(new int[]{-1, -1},
        new Solution_34().searchRange(new int[]{}, 0));

    assertArrayEquals(new int[]{-1, -1},
        new Solution_34().searchRange(new int[]{1}, 2));

    assertArrayEquals(new int[]{-1, -1},
        new Solution_34().searchRange(new int[]{2, 2}, 8));

    assertArrayEquals(new int[]{0, 1},
        new Solution_34().searchRange(new int[]{2, 2}, 2));

    assertArrayEquals(new int[]{0, 0},
        new Solution_34().searchRange(new int[]{1}, 1));
  }

  @Test
  public void test_whenSolution2() {
    assertArrayEquals(new int[]{3, 4},
        new Solution_34().searchRange2(new int[]{5, 7, 7, 8, 8, 10}, 8));

    assertArrayEquals(new int[]{-1, -1},
        new Solution_34().searchRange2(new int[]{5, 7, 7, 8, 8, 10}, 6));

    assertArrayEquals(new int[]{-1, -1},
        new Solution_34().searchRange2(new int[]{}, 0));

    assertArrayEquals(new int[]{-1, -1},
        new Solution_34().searchRange2(new int[]{1}, 2));

    assertArrayEquals(new int[]{-1, -1},
        new Solution_34().searchRange2(new int[]{2, 2}, 8));

    assertArrayEquals(new int[]{0, 1},
        new Solution_34().searchRange2(new int[]{2, 2}, 2));

    assertArrayEquals(new int[]{0, 0},
        new Solution_34().searchRange2(new int[]{1}, 1));
  }
}