package com.vojik.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution_539 {

  public int findMinDifference(List<String> timePoints) {
    if (timePoints.size() == 1) {
      return 0;
    }
    int[] absoluteTimes = new int[timePoints.size()];
    for (int i = 0; i < timePoints.size(); i++) {
      absoluteTimes[i] = parseTime(timePoints.get(i));
    }
    Arrays.sort(absoluteTimes);
    int result = Integer.MAX_VALUE;
    for (int i = 1; i < absoluteTimes.length; i++) {
      result = Math.min(result, absoluteTimes[i] - absoluteTimes[i - 1]);
    }

    int maxValue = 1440;
    result = Math.min(result, maxValue - absoluteTimes[absoluteTimes.length - 1] + absoluteTimes[0]);

    return result;
  }

  private int parseTime(String time) {
    int hours = Integer.parseInt(time.substring(0, 2)) * 60;
    int minutes = Integer.parseInt(time.substring(3, 5));
    return hours + minutes;
  }

}
