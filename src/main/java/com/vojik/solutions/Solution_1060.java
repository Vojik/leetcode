package com.vojik.solutions;

/**
 * 1060. Missing Element in Sorted Array
 */
public class Solution_1060 {

  // Time: O(log(n)) Space: O(1)
  public int missingElement(int[] nums, int k) {
    int left = 0, right = nums.length - 1;
    int missedNums = nums[right] - nums[0] - right;
    if (missedNums < k) {
      return nums[right] + k - missedNums;
    }

    while (left + 1 < right) {
      int mid = left + (right - left) / 2;
      missedNums = nums[mid] - nums[0] - mid;
      if (missedNums >= k) {
        right = mid;
      } else {
        left = mid;
      }
    }

    return nums[0] + left + k;
  }
}
