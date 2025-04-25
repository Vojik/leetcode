package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_310Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(
        List.of((1)),
        new Solution_310().findMinHeightTrees(4, new int[][] {{1, 0}, {1, 2}, {1, 3}}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(
        List.of(3, 4),
        new Solution_310().findMinHeightTrees(6,
            new int[][] {{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(
        List.of(0),
        new Solution_310().findMinHeightTrees(1,
            new int[][] {}));
  }

}