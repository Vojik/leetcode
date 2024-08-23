package com.vojik.solutions;

/**
 * 162. Find Peak Element
 *
 * <p>A peak element is an element that is greater than its neighbors.
 * <p>Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its
 * index.
 * <p>The array may contain multiple peaks, in that case return the index to any one of the peaks
 * is fine.
 *
 * <p>You may imagine that nums[-1] = nums[n] = -∞.
 *
 * <p>Example 1:
 * <p>Input: nums = [1,2,3,1] Output: 2 Explanation: 3 is a peak element and your function should
 * return the index number 2. Example 2:
 * <p>Input: nums = [1,2,1,3,5,6,4] Output: 1 or 5 Explanation: Your function can return either
 * index number 1 where the peak element is 2, or index number 5 where the peak element is 6. Follow
 * up: Your solution should be in logarithmic complexity.
 */
public class Solution_162 {

  public int findPeakElement(int[] nums) {
    if (nums.length == 1) {
      return 0;
    }

    int left = 0;
    int right = nums.length - 1;

    while (left < right && right - left != 1) {
      int middle = left + (right - left) / 2;

      if (nums[middle - 1] == nums[middle + 1] && nums[middle - 1] < nums[middle]) {
        return middle;
      } else if (nums[middle - 1] > nums[middle + 1]) {
        if (nums[middle] > nums[middle - 1]) {
          right = middle;
        } else {
          right = middle - 1;
        }
      } else {
        if (nums[middle] > nums[middle + 1]) {
          left = middle;
        } else {
          left = middle + 1;
        }
      }
    }
    return nums[left] > nums[right] ? left : right;
  }

  public int findPeakElement2(int[] nums) {
    if (nums.length == 1) {
      return 0;
    }

    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      int middle = left + (right - left) / 2;
      int middle2 = middle + 1;

      if (nums[middle] > nums[middle2]) {
        right = middle;
      } else {
        left = middle2;
      }
    }
    return nums[left] > nums[right] ? left : right;
  }

  public int findPeakElement3(int[] nums) {
    int lo = 0;
    int hi = nums.length - 1;
    int ans = Integer.MIN_VALUE;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (mid >= 1 && nums[mid] > nums[mid - 1]) {
        ans = mid;
        lo = mid + 1;
      } else if (mid < nums.length - 1 && nums[mid] < nums[mid + 1]) {
        ans = mid;
        lo = mid + 1;
      } else {
        hi = mid - 1;
      }
    }
    return ans == Integer.MIN_VALUE ? 0 : ans;
  }
}
