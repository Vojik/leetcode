package com.vojik.solutions;

import java.util.Arrays;

/**
 * 259. 3Sum Smaller
 */
public class Solution_259 {

  public int threeSumSmaller(int[] nums, int target) {
    Arrays.sort(nums);
    int total = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      int count = threeSumSmaller(nums, i, target);
      total += count;
    }
    return total;
  }

  private int threeSumSmaller(int[] nums, int i, int target) {
    int lo = i + 1;
    int hi = nums.length - 1;
    int count = 0;
    while (lo < hi) {
      int sum = nums[i] + nums[lo] + nums[hi];
      if (sum < target) {
        count += hi - lo;
        lo++;
      } else {
        hi--;
      }
    }
    return count;
  }
}
