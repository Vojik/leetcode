package com.vojik.solutions;

/**
 * 1752. Check if Array Is Sorted and Rotated
 */
public class Solution_1752 {

  public boolean check(int[] nums) {
    int pivot = 1, n = nums.length;
    while (pivot < n && nums[pivot] >= nums[pivot - 1]) {
      pivot++;
    }
    if (pivot == n) {
      return true;
    }
    int i = pivot + 1;
    while (i < n && nums[i] >= nums[i - 1]) {
      i++;
    }
    if (i == n && nums[i - 1] <= nums[0]) {
      return true;
    }
    return false;
  }
}
