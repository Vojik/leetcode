package com.vojik.solutions;

/**
 * 2658. Maximum Number of Fish in a Grid
 */
public class Solution_2658 {

  public int findMaxFish(int[][] grid) {
    int r = grid.length;
    int c = grid[0].length;
    boolean[][] visited = new boolean[r][c];
    int fishCount = 0;
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        if (grid[i][j] > 0 && !visited[i][j]) {
          fishCount = Math.max(fishCount, dfs(grid, i, j, visited));
        }
      }
    }
    return fishCount;
  }

  private int dfs(int[][] grid, int r, int c, boolean[][] visited) {
    if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || visited[r][c]
        || grid[r][c] == 0) {
      return 0;
    } else {
      visited[r][c] = true;
      return grid[r][c]
          + dfs(grid, r, c + 1, visited)
          + dfs(grid, r, c - 1, visited)
          + dfs(grid, r + 1, c, visited)
          + dfs(grid, r - 1, c, visited);
    }
  }
}
