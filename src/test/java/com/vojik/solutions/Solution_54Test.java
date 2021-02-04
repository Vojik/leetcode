package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_54Test {

  @Test
  public void test1_whenSolution1() {
    List<Integer> expected = List.of(1, 2, 3, 6, 9, 8, 7, 4, 5);
    assertEquals(expected,
        new Solution_54().spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
  }

  @Test
  public void test2_whenSolution1() {
    List<Integer> expected = List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
    assertEquals(expected,
        new Solution_54().spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
  }

  @Test
  public void test3_whenSolution1() {
    List<Integer> expected = List.of(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10);
    assertEquals(expected,
        new Solution_54().spiralOrder(
            new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}));
  }
}