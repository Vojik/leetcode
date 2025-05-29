package com.vojik.solutions;

/** 74. Search a 2D Matrix */
public class Solution_74 {

  public boolean searchMatrix(int[][] matrix, int target) {
    int m = matrix.length;
    int n = matrix[0].length;

    if (target < matrix[0][0] || target > matrix[m - 1][n - 1]) {
      return false;
    }
    int row = getRow(matrix, target, m);
    return isExist(matrix[row], target);
  }

  private int getRow(int[][] matrix, int target, int m) {
    int lo = 0, ans = 0;
    int hi = m - 1;
    while (lo <= hi) {
      int mid = (lo + hi) / 2;
      if (target == matrix[mid][0]) {
        return mid;
      } else if (target < matrix[mid][0]) {
        hi = mid - 1;
      } else {
        lo = mid + 1;
        ans = mid;
      }
    }
    return ans;
  }

  private boolean isExist(int[] row, int target) {
    int lo = 0, hi = row.length - 1;
    while (lo <= hi) {
      int mid = (lo + hi) / 2;
      if (row[mid] == target) {
        return true;
      } else if (row[mid] > target) {
        hi = mid - 1;
      } else {
        lo = mid + 1;
      }
    }
    return false;
  }
}
