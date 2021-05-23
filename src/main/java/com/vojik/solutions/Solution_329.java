package com.vojik.solutions;

/** 329. Longest Increasing Path in a Matrix */
public class Solution_329 {

  private static final int[][] DIRECTIONS = new int[][] {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

  public int longestIncreasingPath(int[][] matrix) {
    int result = 0;
    int[][] memo = new int[matrix.length][matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        result = Math.max(result, dfs(matrix, i, j, memo));
      }
    }
    return result;
  }

  private int dfs(int[][] matrix, int i, int j, int[][] memo) {
    if (memo[i][j] != 0) {
      return memo[i][j];
    }
    int ans = 0;
    for (int[] dir : DIRECTIONS) {
      int x = i + dir[0];
      int y = j + dir[1];
      if (x >= 0
          && x < matrix.length
          && y >= 0
          && y < matrix[0].length
          && matrix[i][j] < matrix[x][y]) {
        ans = Math.max(ans, dfs(matrix, x, y, memo));
      }
    }
    ans++;
    memo[i][j] = ans;
    return ans;
  }
}
