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
}
