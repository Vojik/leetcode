package com.vojik.solutions;

/**
 * 64. Minimum Path Sum
 */
public class Solution_64 {

  public int minPathSum(int[][] grid) {
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (i == 0 && j == 0) {
          continue;
        }
        int f1 = i - 1 >= 0 ? grid[i - 1][j] : Integer.MAX_VALUE;
        int f2 = j - 1 >= 0 ? grid[i][j - 1] : Integer.MAX_VALUE;
        grid[i][j] = grid[i][j] + Math.min(f1, f2);
      }
    }
    return grid[grid.length - 1][grid[0].length - 1];
  }
}
