package com.vojik.solutions;

/**
 * 766. Toeplitz Matrix
 */
public class Solution_766 {

  public boolean isToeplitzMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length - 1; i++) {
      if (!isToeplitzDiagonal(matrix, i, 0)) {
        return false;
      }
    }
    for (int i = 0; i < matrix[0].length - 1; i++) {
      if (!isToeplitzDiagonal(matrix, 0, i)) {
        return false;
      }
    }
    return true;
  }

  private boolean isToeplitzDiagonal(int[][] matrix, int row, int col) {
    int value = matrix[row++][col++];
    while (row < matrix.length && col < matrix[0].length) {
      if (matrix[row][col] != value) {
        return false;
      }
      row++;
      col++;
    }
    return true;
  }
}
