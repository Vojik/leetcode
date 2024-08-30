package com.vojik.solutions;

/**
 * 34. Find First and Last Position of Element in Sorted Array
 *
 * <p>Given an array of integers nums sorted in ascending order, find the starting and ending
 * position of a given target value.
 *
 * <p>If target is not found in the array, return [-1, -1].
 *
 * <p>Follow up: Could you write an algorithm with O(log n) runtime complexity?
 *
 * <p>Example 1:
 * <p>Input: nums = [5,7,7,8,8,10], target = 8 Output: [3,4]
 * <p>Example 2:
 * <p>Input: nums = [5,7,7,8,8,10], target = 6 Output: [-1,-1]
 * <p>Example 3:
 * <p>Input: nums = [], target = 0 Output: [-1,-1]
 *
 * <p>Constraints:
 * <p>0 <= nums.length <= 105 -109 <= nums[i] <= 109 nums is a non-decreasing array. -109 <= target
 * <= 109
 */
public class Solution_34 {

  public int[] searchRange(int[] nums, int target) {

    if (nums.length == 0 || (nums.length == 1 && nums[0] != target)) {
      return new int[]{-1, -1};
    }

    if (nums.length == 1) {
      return new int[]{0, 0};
    }

    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {

      int middle = left + (right - left) / 2;

      if (nums[middle] == target) {
        left = middle - 1;
        while (left >= 0 && nums[left] == target) {
          left--;
        }
        right = middle + 1;
        while (right < nums.length && nums[right] == target) {
          right++;
        }
        return new int[]{++left, --right};
      } else if (nums[middle] > target) {
        right = middle - 1;
      } else {
        left = middle + 1;
      }
    }
    return new int[]{-1, -1};
  }

  public int[] searchRange2(int[] nums, int target) {
    return new int[] {binarySearch(nums, target, true), binarySearch(nums, target, false)};
  }

  private int binarySearch(int[] nums, int target, boolean isFirstLeft) {
    int lo = 0;
    int hi = nums.length - 1;
    int ans = -1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (nums[mid] == target) {
        ans = mid;
        if (isFirstLeft) {
          hi = mid - 1;
        } else {
          lo = mid + 1;
        }

      } else if (nums[mid] < target) {
        lo = mid + 1;
      } else {
        hi = mid - 1;
      }
    }
    return ans;
  }
}
