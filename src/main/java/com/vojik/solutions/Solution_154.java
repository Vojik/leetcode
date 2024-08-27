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

  public int findMin2(int[] nums) {
    int right = nums.length - 1;
    int lo = 0;
    int hi = right;
    int ans = -1;

    while (lo < hi && nums[lo] == nums[hi]) {
      lo++;
    }

    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (nums[mid] <= nums[right]) {
        ans = nums[mid];
        hi = mid - 1;
      } else {
        lo = mid + 1;
      }
    }
    return ans;
  }
}