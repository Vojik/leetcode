package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_496Test {

  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(new int[]{-1, 3, -1},
        new Solution_496().nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}));
  }

  @Test
  public void test2_whenSolution1() {
    assertArrayEquals(new int[]{3, -1},
        new Solution_496().nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4}));
  }

  @Test
  public void test1_whenSolution2() {
    assertArrayEquals(new int[]{-1, 3, -1},
        new Solution_496().nextGreaterElement2(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}));
  }

  @Test
  public void test2_whenSolution2() {
    assertArrayEquals(new int[]{3, -1},
        new Solution_496().nextGreaterElement2(new int[]{2, 4}, new int[]{1, 2, 3, 4}));
  }

}