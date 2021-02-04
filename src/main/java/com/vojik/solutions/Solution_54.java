package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 54. Spiral Matrix
 */
public class Solution_54 {

  // Time: O(n) Space: O(1)
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    int m = matrix.length;
    int n = matrix[0].length;
    int top = 0;
    int bottom = m - 1;
    int left = 0;
    int right = n - 1;

    while (result.size() < m * n) {

      // go right
      for (int j = left; j <= right && result.size() < m * n; j++) {
        result.add(matrix[top][j]);
      }

      // got down
      for (int i = top + 1; i <= bottom && result.size() < m * n; i++) {
        result.add(matrix[i][right]);
      }

      // go left
      for (int j = right - 1; j >= left && result.size() < m * n; j--) {
        result.add(matrix[bottom][j]);
      }

      // go up
      for (int i = bottom - 1; i > top && result.size() < m * n; i--) {
        result.add(matrix[i][left]);
      }
      top++;
      bottom--;
      left++;
      right--;
    }

    return result;
  }
}