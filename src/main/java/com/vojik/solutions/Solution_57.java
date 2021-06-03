package com.vojik.solutions;

import java.util.Arrays;

/** 57. Insert Interval */
public class Solution_57 {

  public int[][] insert(int[][] intervals, int[] newInterval) {
    int[][] result = new int[intervals.length + 1][2];
    int idx = 0;
    int i = 0; // idx for intervals

    while (i < intervals.length && intervals[i][1] < newInterval[0]) {
      result[idx++] = intervals[i++];
    }

    int lo = newInterval[0];
    int hi = newInterval[1];
    while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
      lo = Math.min(intervals[i][0], lo);
      hi = Math.max(intervals[i][1], hi);
      result[idx] = new int[] {lo, hi};
      i++;
    }
    result[idx++] = new int[] {lo, hi};

    while (i < intervals.length) {
      result[idx++] = intervals[i++];
    }
    return Arrays.copyOf(result, idx);
  }
}
