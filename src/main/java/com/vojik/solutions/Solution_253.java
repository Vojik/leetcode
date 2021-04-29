package com.vojik.solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 253. Meeting Rooms II
 *
 * <p>Given an array of meeting time intervals intervals where intervals[i] = [starti, endi], return
 * the minimum number of conference rooms required.
 *
 * <p>Example 1:
 *
 * <p>Input: intervals = [[0,30],[5,10],[15,20]] Output: 2 Example 2:
 *
 * <p>Input: intervals = [[7,10],[2,4]] Output: 1
 *
 * <p>Constraints:
 *
 * <p>1 <= intervals.length <= 104
 * <p>0 <= start(i) < end(i) <= 106
 */
public class Solution_253 {

  public int minMeetingRooms(int[][] intervals) {
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    PriorityQueue<Integer> busyRooms = new PriorityQueue<>();
    int maxNumRooms = 0;
    for (int[] interval : intervals) {
      if (!busyRooms.isEmpty() && interval[0] >= busyRooms.peek()) {
        busyRooms.poll();
      }
      busyRooms.add(interval[1]);
      maxNumRooms = Math.max(maxNumRooms, busyRooms.size());
    }

    return maxNumRooms;
  }
}
