package com.vojik.solutions;

/**
 * 154. Find Minimum in Rotated Sorted Array II
 */
public class Solution_154 {

  public int findMin(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }

    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      int middle = left + (right - left) / 2;

      if (nums[middle] > nums[right]) {
        left = middle + 1;
      } else if (nums[middle] < nums[left]) {
        right = middle;
      } else {
        right--;
      }

    }
    return nums[left];
  }
}