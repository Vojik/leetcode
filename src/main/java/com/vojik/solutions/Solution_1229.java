package com.vojik.solutions;

import java.util.Arrays;
import java.util.List;

/**
 * 1229. Meeting Scheduler
 */
public class Solution_1229 {

  public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {

    Arrays.sort(slots1, (a, b) -> a[0] - b[0]);
    Arrays.sort(slots2, (a, b) -> a[0] - b[0]);

    int idx1 = 0;
    int idx2 = 0;
    while (idx1 < slots1.length && idx2 < slots2.length) {
      if (slots1[idx1][0] > slots2[idx2][1]) {
        idx2++;
      } else if (slots2[idx2][0] > slots1[idx1][1]) {
        idx1++;
      } else {
        int left = Math.max(slots1[idx1][0], slots2[idx2][0]);
        int right = Math.min(slots1[idx1][1], slots2[idx2][1]);
        if (right - left >= duration) {
          return List.of(left, left + duration);
        } else if (slots1[idx1][1] < slots2[idx2][1]) {
          idx1++;
        } else {
          idx2++;
        }
      }
    }
    return List.of();
  }
}
