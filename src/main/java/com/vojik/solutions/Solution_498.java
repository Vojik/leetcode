package com.vojik.solutions;

/**
 * 498. Diagonal Traverse
 */
public class Solution_498 {

  public int[] findDiagonalOrder(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return new int[]{};
    }
    int M = matrix.length;
    int N = matrix[0].length;
    int[] result = new int[M * N];
    int k = 0;
    int i = 0;
    int j = 0;

    while (k < M * N) {
      // going up
      while (i < M && i >= 0 && j >= 0 && j < N) {
        result[k++] = matrix[i][j];
        i--;
        j++;
      }
      i++;
      if (j == N) {
        j--;
        i++;
      }

      // going down
      while (i < M && i >= 0 && j >= 0 && j < N) {
        result[k++] = matrix[i][j];
        i++;
        j--;
      }
      j++;
      if (i == M) {
        i--;
        j++;
      }
    }
    return result;
  }
}