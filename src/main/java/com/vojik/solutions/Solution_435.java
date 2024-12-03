package com.vojik.solutions;

import java.util.Arrays;

/**
 * 435. Non-overlapping Intervals
 */
public class Solution_435 {

  public int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    int idx = 0;
    int res = 0;

    for (int i = 1; i < intervals.length; i++) {
      if (intervals[i][0] < intervals[idx][1]) { // overlapping
        if (intervals[i][1] < intervals[idx][1]) {
          idx = i;
        }
        res++;
      } else {
        idx = i;
      }
    }

    return res;
  }
}
