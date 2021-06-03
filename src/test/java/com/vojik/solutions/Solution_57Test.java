package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_57Test {

  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(
        new int[][] {{1, 5}, {6, 9}},
        new Solution_57().insert(new int[][] {{1, 3}, {6, 9}}, new int[] {2, 5}));
  }

  @Test
  public void test2_whenSolution1() {
    assertArrayEquals(
        new int[][] {{1, 2}, {3, 10}, {12, 16}},
        new Solution_57()
            .insert(new int[][] {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[] {4, 8}));
  }

  @Test
  public void test3_whenSolution1() {
    assertArrayEquals(
        new int[][] {{5, 7}}, new Solution_57().insert(new int[][] {}, new int[] {5, 7}));
  }

  @Test
  public void test4_whenSolution1() {
    assertArrayEquals(
        new int[][] {{1, 5}}, new Solution_57().insert(new int[][] {{1, 5}}, new int[] {2, 3}));
  }

  @Test
  public void test5_whenSolution1() {
    assertArrayEquals(
        new int[][] {{1, 7}}, new Solution_57().insert(new int[][] {{1, 5}}, new int[] {2, 7}));
  }
}
