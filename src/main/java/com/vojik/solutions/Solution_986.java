package com.vojik.solutions;

import java.util.Arrays;

/**
 * 986. Interval List Intersections
 */
public class Solution_986 {

  // Time Complexity: O(M + N)
  // Space Complexity: O(M + N)
  public int[][] intervalIntersection(int[][] A, int[][] B) {
    int[][] result = new int[A.length + B.length][2];
    int curA = 0;
    int curB = 0;
    int curR = 0;
    while (curA < A.length && curB < B.length) {
      int lo = Math.max(A[curA][0], B[curB][0]);
      int hi = Math.min(A[curA][1], B[curB][1]);
      if (lo <= hi) {
        result[curR++] = new int[]{lo, hi};
      }

      // if ((A[curA][0] <= B[curB][0] && A[curA][1] >= B[curB][0]) || (B[curB][0] < A[curA][0] && B[curB][1] >= A[curA][0])) {
      //     result[curR++] = new int[]{Math.max(A[curA][0], B[curB][0]), Math.min(B[curB][1], A[curA][1])};
      // }
      if (A[curA][1] < B[curB][1]) {
        curA++;
      } else {
        curB++;
      }
    }
    return Arrays.copyOf(result, curR);
  }
}
