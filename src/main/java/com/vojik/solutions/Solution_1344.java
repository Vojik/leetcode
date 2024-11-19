package com.vojik.solutions;

/**
 * 1344. Angle Between Hands of a Clock
 */
public class Solution_1344 {

  // Time: O(1) Space: O(1)
  public double angleClock(int hour, int minutes) {
    double m = 6 * (minutes % 60);
    double h = (hour % 12 + minutes / 60.0) * 30;

    double diff = Math.abs(h - m);
    return Math.min(diff, 360 - diff);
  }
}
