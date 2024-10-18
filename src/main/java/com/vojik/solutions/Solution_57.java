package com.vojik.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 57. Insert Interval
 */
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
      result[idx] = new int[]{lo, hi};
      i++;
    }
    result[idx++] = new int[]{lo, hi};

    while (i < intervals.length) {
      result[idx++] = intervals[i++];
    }
    return Arrays.copyOf(result, idx);
  }

  public int[][] insert2(int[][] intervals, int[] newInterval) {
    List<int[]> list = new ArrayList<>();
    int idx = 0;
    int len = intervals.length;
    while (idx < len && intervals[idx][1] < newInterval[0]) {
      list.add(intervals[idx++]);
    }

    while (idx < len && newInterval[0] <= intervals[idx][1]
        && newInterval[1] >= intervals[idx][0]) {
      newInterval[0] = Math.min(newInterval[0], intervals[idx][0]);
      newInterval[1] = Math.max(newInterval[1], intervals[idx][1]);
      idx++;
    }

    list.add(newInterval);

    while (idx < len) {
      list.add(intervals[idx++]);
    }
    return list.toArray(new int[list.size()][]);
  }
}
