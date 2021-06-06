package com.vojik.solutions;

/** 221. Maximal Square */
public class Solution_221 {

  public int maximalSquare(char[][] matrix) {
    int[][] squares = new int[matrix.length + 1][matrix[0].length + 1];
    int result = 0;
    for (int i = 1; i <= matrix.length; i++) {
      for (int j = 1; j <= matrix[0].length; j++) {
        if (matrix[i - 1][j - 1] == '1') {
          squares[i][j] =
              Math.min(squares[i][j - 1], Math.min(squares[i - 1][j], squares[i - 1][j - 1])) + 1;
          result = Math.max(squares[i][j], result);
        }
      }
    }
    return result * result;
  }
}
