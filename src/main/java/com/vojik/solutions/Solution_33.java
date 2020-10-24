package com.vojik.solutions;

/**
 * 33. Search in Rotated Sorted Array
 *
 * <p>You are given an integer array nums sorted in ascending order, and an integer target.
 *
 * <p>Suppose that nums is rotated at some pivot unknown to you beforehand (i.e., [0,1,2,4,5,6,7]
 * might become [4,5,6,7,0,1,2]).
 *
 * <p>If target is found in the array return its index, otherwise, return -1.
 *
 * <p>Example 1:
 * <p>Input: nums = [4,5,6,7,0,1,2], target = 0 Output: 4 Example 2:
 * <p>Input: nums = [4,5,6,7,0,1,2], target = 3 Output: -1 Example 3:
 * <p>Input: nums = [1], target = 0 Output: -1
 * <p>Constraints:
 * <p>1 <= nums.length <= 5000 -10^4 <= nums[i] <= 10^4 All values of nums are unique. nums is
 * guranteed to be rotated at some pivot. -10^4 <= target <= 10^4
 */
public class Solution_33 {

  public int search(int[] nums, int target) {
    if (nums.length == 1 && nums[0] != target) {
      return -1;
    }

    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int middle = left + (right - left) / 2;

      if (target == nums[left]) {
        return left;
      } else if (target == nums[right]) {
        return right;
      } else if (target == nums[middle]) {
        return middle;
      }

      // if the left side monotonically increasing, or the pivot is on the right part
      if (nums[left] < nums[middle]) {

        if (target > nums[left] && target < nums[middle]) {
          right = middle - 1;
        } else {
          left = middle + 1;
        }

      } else {
        // if the right side monotonically increasing, or the pivot is on the left part
        if (target < nums[right] && target > nums[middle]) {
          left = middle + 1;
        } else {
          right = middle - 1;
        }
      }
    }
    return -1;
  }

  public int search2(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        return i;
      }
    }
    return -1;
  }

}
