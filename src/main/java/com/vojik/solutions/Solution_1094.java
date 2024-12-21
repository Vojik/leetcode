package com.vojik.solutions;

import java.util.PriorityQueue;

/**
 * 1094. Car Pooling
 */
public class Solution_1094 {

  // Time: O(nlogn) Space: O(n)
  public boolean carPooling(int[][] trips, int capacity) {
    PriorityQueue<int[]> sortedTrips = new PriorityQueue<>((a, b) -> a[1] - b[1]);
    for (int[] trip : trips) {
      sortedTrips.add(trip);
    }

    PriorityQueue<int[]> inProgressTrips = new PriorityQueue<>((a, b) -> a[2] - b[2]);
    int passengers = 0;
    while (!sortedTrips.isEmpty()) {
      int[] trip = sortedTrips.poll();
      while (!inProgressTrips.isEmpty() && inProgressTrips.peek()[2] <= trip[1]) {
        int[] prevTrip = inProgressTrips.poll();
        passengers -= prevTrip[0];
      }

      if (capacity < passengers + trip[0]) {
        return false;
      } else {
        passengers += trip[0];
        inProgressTrips.add(trip);
      }
    }
    return true;
  }
}
