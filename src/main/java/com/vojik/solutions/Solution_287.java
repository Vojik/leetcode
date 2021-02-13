package com.vojik.solutions;

import java.util.Arrays;

/**
 * 287. Find the Duplicate Number
 */
public class Solution_287 {

  public int findDuplicate(int[] nums) {
    Arrays.sort(nums);

    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (mid >= nums[mid]) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return nums[left];
  }
}
