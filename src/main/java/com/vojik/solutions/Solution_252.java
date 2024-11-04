package com.vojik.solutions;

import java.util.Arrays;

/**
 * 252. Meeting Rooms
 */
public class Solution_252 {

  public boolean canAttendMeetings(int[][] intervals) {
    Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);
    int end = 0;
    for (int i = 0; i < intervals.length; i++) {
      if (intervals[i][0] < end) {
        return false;
      }
      end = intervals[i][1];
    }
    return true;
  }

  // Time: O(nlogn)
  // Space: O(1)
  public boolean canAttendMeetings2(int[][] intervals) {
    Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
    for (int i = 1; i < intervals.length; i++) {
      if (intervals[i - 1][1] > intervals[i][0]) {
        return false;
      }
    }
    return true;
  }
}
