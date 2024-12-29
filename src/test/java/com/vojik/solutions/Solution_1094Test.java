package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_1094Test {

  @Test
  public void test1_whenSolution1() {
    assertFalse(new Solution_1094().carPooling(new int[][]{{2, 1, 5}, {3, 3, 7}}, 4));
  }

  @Test
  public void test2_whenSolution1() {
    assertTrue(new Solution_1094().carPooling(new int[][]{{2, 1, 5}, {3, 3, 7}}, 5));
  }

  @Test
  public void test3_whenSolution1() {
    assertTrue(new Solution_1094().carPooling(new int[][]{{2, 2, 6}, {2, 4, 7}, {8, 6, 7}}, 11));
  }

  @Test
  public void test1_whenSolution2() {
    assertFalse(new Solution_1094().carPooling2(new int[][]{{2, 1, 5}, {3, 3, 7}}, 4));
  }

  @Test
  public void test2_whenSolution2() {
    assertTrue(new Solution_1094().carPooling2(new int[][]{{2, 1, 5}, {3, 3, 7}}, 5));
  }

  @Test
  public void test3_whenSolution2() {
    assertTrue(new Solution_1094().carPooling2(new int[][]{{2, 2, 6}, {2, 4, 7}, {8, 6, 7}}, 11));
  }
}