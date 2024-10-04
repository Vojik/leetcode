package com.vojik.solutions;

import java.util.PriorityQueue;

/**
 * 3028. Ant on the Boundary
 */
public class Solution_3028 {

  public int returnToBoundaryCount(int[] nums) {
    int sum = 0;
    int ans = 0;
    for (int n : nums) {
      sum += n;
      if (sum == 0) ans++;
    }
    return ans;
  }

}
