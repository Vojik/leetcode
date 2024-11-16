package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_1424Test {

  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(new int[]{1, 4, 2, 7, 5, 3, 8, 6, 9},
        new Solution_1424().findDiagonalOrder(
            List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9))));
  }

  @Test
  public void test2_whenSolution1() {
    assertArrayEquals(new int[]{1, 6, 2, 8, 7, 3, 9, 4, 12, 10, 5, 13, 11, 14, 15, 16},
        new Solution_1424().findDiagonalOrder(
            List.of(List.of(1, 2, 3, 4, 5), List.of(6, 7), List.of(8), List.of(9, 10, 11),
                List.of(12, 13, 14, 15, 16))));
  }

  @Test
  public void test3_whenSolution1() {
    assertArrayEquals(new int[]{14, 13, 12, 11, 14, 19, 13, 15, 16, 1, 8, 9, 11},
        new Solution_1424().findDiagonalOrder(
            List.of(List.of(14, 12, 19, 16, 9), List.of(13, 14, 15, 8, 11), List.of(11, 13, 1))));
  }
}