package com.vojik.solutions;

/**
 * 562. Longest Line of Consecutive One in Matrix
 *
 * <p>Given an m x n binary matrix mat, return the length of the longest line of consecutive one in
 * the matrix.
 *
 * <p>The line could be horizontal, vertical, diagonal, or anti-diagonal.
 *
 * <p>Example 1:
 *
 * <p>Input: mat = [[0,1,1,0],[0,1,1,0],[0,0,0,1]] Output: 3
 *
 * <p>Example 2:
 *
 * <p>Input: mat = [[1,1,1,1],[0,1,1,0],[0,0,0,1]] Output: 4
 *
 * <p>Constraints:
 *
 * <p>m == mat.length n == mat[i].length 1 <= m, n <= 104 1 <= m * n <= 104 mat[i][j] is either 0 or
 * 1.
 */
public class Solution_562 {
  public int longestLine(int[][] mat) {
    int longest = 0;
    int[][][] dp = new int[mat.length][mat[0].length][4];
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        if (mat[i][j] == 1) {
          dp[i][j][0] = j > 0 ? dp[i][j - 1][0] + 1 : 1;
          dp[i][j][1] = i > 0 ? dp[i - 1][j][1] + 1 : 1;
          dp[i][j][2] = (i > 0 && j > 0) ? dp[i - 1][j - 1][2] + 1 : 1;
          dp[i][j][3] = (i > 0 && j < mat[0].length - 1) ? dp[i - 1][j + 1][3] + 1 : 1;
          longest =
              Math.max(
                  longest,
                  Math.max(Math.max(dp[i][j][0], dp[i][j][1]), Math.max(dp[i][j][2], dp[i][j][3])));
        }
      }
    }
    return longest;
  }

  public int longestLine2(int[][] mat) {
    int longest = 0;
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        if (mat[i][j] == 1) {
          longest = Math.max(longestLine(mat, i, j), longest);
        }
      }
    }
    return longest;
  }

  private int longestLine(int[][] mat, int i, int j) {
    int ans = 0;
    // down
    int x = i;
    int y = j;
    int size = 0;
    while (x < mat.length && mat[x][y] == 1) {
      size++;
      x++;
    }
    ans = Math.max(size, ans);

    // right
    size = 0;
    x = i;
    while (y < mat[0].length && mat[x][y] == 1) {
      size++;
      y++;
    }
    ans = Math.max(size, ans);

    // diagonal
    size = 0;
    y = j;
    while (x < mat.length && y < mat[0].length && mat[x][y] == 1) {
      size++;
      y++;
      x++;
    }
    ans = Math.max(size, ans);

    // anti-diagonal
    size = 0;
    x = i;
    y = j;
    while (x < mat.length && x >= 0 && y < mat[0].length && y >= 0 && mat[x][y] == 1) {
      size++;
      y--;
      x++;
    }
    ans = Math.max(size, ans);

    return ans;
  }
}
