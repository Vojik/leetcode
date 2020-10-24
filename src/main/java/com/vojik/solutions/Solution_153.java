package com.vojik.solutions;

/**
 * 153. Find Minimum in Rotated Sorted Array
 *
 * <p>Suppose an array sorted in ascending order is rotated at some pivot unknown to you
 * beforehand.
 * <p>(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 * <p>Find the minimum element.
 * <p>You may assume no duplicate exists in the array.
 *
 * <p>Example 1:
 * <p>Input: [3,4,5,1,2] Output: 1 Example 2:
 * <p>Input: [4,5,6,7,0,1,2] Output: 0
 */
public class Solution_153 {

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
        right = middle - 1;
      }

    }
    return nums[left];
  }
}
