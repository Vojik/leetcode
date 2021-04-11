package com.vojik.solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 253. Meeting Rooms II
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
