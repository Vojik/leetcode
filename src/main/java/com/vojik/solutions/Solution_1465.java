package com.vojik.solutions;

import java.util.Arrays;

/** 1465. Maximum Area of a Piece of Cake After Horizontal and Vertical Cuts */
public class Solution_1465 {
  // Time complexity: O((n+m)log(n+m))
  public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
    long ans = getMaxCut(horizontalCuts, h) * getMaxCut(verticalCuts, w);
    return (int) (ans % 1_000_000_007);
  }

  private long getMaxCut(int[] cuts, int end) {
    Arrays.sort(cuts);
    long max = Math.max(cuts[0], end - cuts[cuts.length - 1]);
    int prev = cuts[0];
    for (int i = 1; i < cuts.length; i++) {
      max = Math.max(max, cuts[i] - prev);
      prev = cuts[i];
    }
    return max;
  }
}
