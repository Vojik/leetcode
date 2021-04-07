package com.vojik.solutions;

import java.util.Arrays;

/**
 * 56. Merge Intervals
 */
public class Solution_56 {

  public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    int[][] merged = new int[intervals.length][2];
    int idx = 0;
    merged[idx++] = intervals[0];

    for (int i = 1; i < intervals.length; i++) {
      if (merged[idx - 1][1] >= intervals[i][0]) {
        merged[idx - 1] = new int[]{merged[idx - 1][0],
            Math.max(intervals[i][1], merged[idx - 1][1])};
      } else {
        merged[idx++] = intervals[i];
      }
    }
    return Arrays.copyOf(merged, idx);
  }
}
