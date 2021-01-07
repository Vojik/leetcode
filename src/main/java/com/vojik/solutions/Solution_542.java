package com.vojik.solutions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 542. 01 Matrix
 */
public class Solution_542 {

  private static final int[][] DIRECTIONS = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

  // BFS Time: O(m *n) Space: O(m * n)
  public int[][] updateMatrix(int[][] matrix) {
    int rows = matrix.length;
    int columns = matrix[0].length;

    Queue<int[]> queue = new LinkedList<>();
    int[][] arr = new int[rows][columns];
    // Time: O(m *n)
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        if (matrix[i][j] == 0) {
          queue.add(new int[]{i, j}); // populate the queue with 0s only
        } else {
          arr[i][j] = Integer.MAX_VALUE;
        }
      }
    }

    // Time: O(m *n)
    while (!queue.isEmpty()) {
      int[] cur = queue.poll();

      for (int[] d : DIRECTIONS) {
        int row = cur[0] + d[0];
        int column = cur[1] + d[1];
        if (row < 0 || row >= rows || column < 0 || column >= columns) {
          continue;
        }

        if (arr[row][column] > arr[cur[0]][cur[1]] + 1) {
          arr[row][column] = arr[cur[0]][cur[1]] + 1;
          queue.add(new int[]{row, column});
        }
      }
    }
    return arr;
  }
}
