package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1091Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(4,
        new Solution_1091().shortestPathBinaryMatrix_bfs(new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 0}}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(2,
        new Solution_1091().shortestPathBinaryMatrix_bfs(new int[][]{{0, 1}, {1, 0}}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(4,
        new Solution_1091().shortestPathBinaryMatrix_bfs(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
  }


  @Test
  public void test1_whenSolution2() {
    assertEquals(4,
        new Solution_1091().shortestPathBinaryMatrix_dfs_TLE(new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 0}}));
  }

  @Test
  public void test2_whenSolution2() {
    assertEquals(2,
        new Solution_1091().shortestPathBinaryMatrix_dfs_TLE(new int[][]{{0, 1}, {1, 0}}));
  }

  @Test
  public void test3_whenSolution2() {
    assertEquals(4,
        new Solution_1091().shortestPathBinaryMatrix_dfs_TLE(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
  }

}