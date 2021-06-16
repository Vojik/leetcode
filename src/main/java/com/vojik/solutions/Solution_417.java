package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

/** 417. Pacific Atlantic Water Flow */
public class Solution_417 {

  private static final int[][] DIRECTIONS = new int[][] {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

  public List<List<Integer>> pacificAtlantic(int[][] heights) {
    int m = heights.length;
    int n = heights[0].length;

    boolean[][] pacific = new boolean[m][n];
    boolean[][] atlantic = new boolean[m][n];
    for (int i = 0; i < m; i++) {
      dfs(heights, i, 0, pacific);
      dfs(heights, i, n - 1, atlantic);
    }
    for (int j = 0; j < n; j++) {
      dfs(heights, 0, j, pacific);
      dfs(heights, m - 1, j, atlantic);
    }

    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (pacific[i][j] && atlantic[i][j]) {
          result.add(List.of(i, j));
        }
      }
    }
    return result;
  }

  private void dfs(int[][] heights, int i, int j, boolean[][] seen) {
    seen[i][j] = true;
    for (int[] dir : DIRECTIONS) {
      int x = i + dir[0];
      int y = j + dir[1];
      if (isLand(x, y, heights) && !seen[x][y] && heights[i][j] <= heights[x][y]) {
        dfs(heights, x, y, seen);
      }
    }
  }

  private boolean isLand(int i, int j, int[][] island) {
    return i >= 0 && i < island.length && j >= 0 && j < island[0].length;
  }
}
