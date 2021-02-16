package com.vojik.solutions;

import java.util.PriorityQueue;

/**
 * 1337. The K Weakest Rows in a Matrix
 */
public class Solution_1337 {

  public int[] kWeakestRows(int[][] mat, int k) {

    PriorityQueue<Row> pq = new PriorityQueue<>(
        (r1, r2) -> r1.soldiers - r2.soldiers != 0 ? r1.soldiers - r2.soldiers : r1.row - r2.row);

    for (int i = 0; i < mat.length; i++) {
      int left = 0;
      int right = mat[0].length;

      while (left < right) {
        int mid = left + (right - left) / 2;
        if (mat[i][mid] == 1) {
          left = mid + 1;
        } else {
          right = mid;
        }
      }
      pq.add(new Row(i, left));
    }

    int[] result = new int[k];
    int idx = 0;
    while (!pq.isEmpty() && idx < k) {
      result[idx++] = pq.poll().row;
    }

    return result;

  }

  class Row {

    int row;
    int soldiers;

    Row(int row, int soldiers) {
      this.row = row;
      this.soldiers = soldiers;
    }
  }
}
