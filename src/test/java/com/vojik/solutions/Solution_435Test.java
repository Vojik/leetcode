package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_435Test {

  @Test
  public void test1_whenSolution() {
    assertEquals(1,
        new Solution_435().eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}));
  }

  @Test
  public void test2_whenSolution() {
    assertEquals(2,
        new Solution_435().eraseOverlapIntervals(new int[][]{{1, 2}, {1, 2}, {1, 2}}));
  }

  @Test
  public void test3_whenSolution() {
    assertEquals(0,
        new Solution_435().eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}}));
  }

  @Test
  public void test4_whenSolution() {
    assertEquals(3,
        new Solution_435().eraseOverlapIntervals(
            new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}, {1, 4}, {1, 5}}));
  }

  @Test
  public void test5_whenSolution() {
    assertEquals(2,
        new Solution_435().eraseOverlapIntervals(
            new int[][]{{0, 2}, {1, 3}, {2, 4}, {3, 5}, {4, 6}}));
  }

  @Test
  public void test6_whenSolution() {
    assertEquals(7,
        new Solution_435().eraseOverlapIntervals(
            new int[][]{{-52, 31}, {-73, -26}, {82, 97}, {-65, -11}, {-62, -49}, {95, 99}, {58, 95},
                {-31, 49}, {66, 98}, {-63, 2}, {30, 47}, {-40, -26}}));
  }

}