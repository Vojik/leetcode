package com.vojik.solutions;

import java.util.Arrays;

/** 16. 3Sum Closest */
public class Solution_16 {

  public int threeSumClosest(int[] nums, int target) {
    // [-4,-1,1,2], target = 1
    // -4, 2 => [-1,1]
    Arrays.sort(nums);
    int result = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length - 1; i++) {
      if (i == 0 || nums[i] != nums[i - 1]) {
        int closest = threeSumClosest(nums, i, target);
        if (Math.abs(target - closest) < Math.abs(target - result)) {
          result = closest;
        }
      }
    }
    return result;
  }

  private int threeSumClosest(int[] nums, int i, int target) {
    int lo = i + 1;
    int hi = nums.length - 1;
    int ans = Integer.MAX_VALUE;
    while (lo < hi) {
      int sum = nums[i] + nums[lo] + nums[hi];
      if (sum == target) {
        return target;
      }
      if (Math.abs(target - sum) < Math.abs(target - ans)) {
        ans = sum;
      }
      if (sum < target) {
        lo++;
      } else {
        hi--;
      }
    }
    return ans;
  }
}
