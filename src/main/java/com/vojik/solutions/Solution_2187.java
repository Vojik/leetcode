package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 2187. Minimum Time to Complete Trips
 */
public class Solution_2187 {

  public long minimumTime(int[] time, int totalTrips) {
    long answer = 0;
    long lo = 1;
    long hi = Integer.MAX_VALUE;
    for (int t : time) {
      hi = Math.min(hi, t);
    }
    hi *= totalTrips;
    while (lo <= hi) {
      long mid = (lo + hi) / 2;
      if (canComplete(time, totalTrips, mid)) {
        answer = mid;
        hi = mid - 1;
      } else {
        lo = mid + 1;
      }
    }
    return answer;
  }

  private boolean canComplete(int[] time, int totalTrips, long current) {
    long total = 0;
    for (int t : time) {
      total += current / t;
      if (total >= totalTrips) return true;
    }
    return total >= totalTrips;
  }

}
