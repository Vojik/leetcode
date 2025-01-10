package com.vojik.solutions;

/**
 * 63. Unique Paths II
 */
public class Solution_63 {

  // Time: O(n*m) Space: O(n*m)
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;
    if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
      return 0;
    }
    int[][] dp = new int[m][n];
    dp[0][0] = 1;
    for (int row = 1; row < m; row++) {
      dp[row][0] = obstacleGrid[row][0] == 1 ? 0 : dp[row - 1][0];
    }

    for (int col = 1; col < n; col++) {
      dp[0][col] = obstacleGrid[0][col] == 1 ? 0 : dp[0][col - 1];
    }
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if (obstacleGrid[i][j] == 1) {
          dp[i][j] = 0;
        } else {
          dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        }
      }
    }
    return dp[m - 1][n - 1];
  }
}
