package com.vojik.solutions;

/**
 * 240. Search a 2D Matrix II
 */
public class Solution_240 {

  // Time: O(m+n) Space: O(1)
  public boolean searchMatrix(int[][] matrix, int target) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == target) {
          return true;
        } else if (matrix[i][j] > target) {
          break;
        }
      }
    }
    return false;
  }

  // Time: O(1/4 mn) + O(1/2 mn) + 1 = O(3/4 mn) + 1   Space: O(1)
  public boolean searchMatrixRecursively(int[][] matrix, int target) {
    return searchMatrix(matrix, target, 0, 0, matrix.length - 1, matrix[0].length - 1);
  }

  private boolean searchMatrix(int[][] matrix, int target, int startRow, int startCol, int endRow,
      int endCol) {
    if (startRow > endRow || startCol > endCol) {
      return false;
    }

    int midRow = (startRow + endRow) / 2;
    int midCol = (startCol + endCol) / 2;
    int val = matrix[midRow][midCol];

    if (val == target) {
      return true;
    } else if (val < target) {
      return searchMatrix(matrix, target, midRow + 1, startCol, endRow, endCol) || searchMatrix(
          matrix, target, startRow, midCol + 1, midRow, endCol);
    } else {
      return searchMatrix(matrix, target, startRow, startCol, endRow, midCol - 1) || searchMatrix(
          matrix, target, startRow, midCol, midRow - 1, endCol);
    }
  }
}
