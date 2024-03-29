package com.vojik.solutions;

/**
 * 27. Remove Element
 *
 * <p>Given an array nums and a value val, remove all instances of that value in-place and return
 * the new length.
 *
 * <p>Do not allocate extra space for another array, you must do this by modifying the input array
 * in-place with O(1) extra memory.
 *
 * <p>The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 *
 * <p>Example 1:
 *
 * <p>Given nums = [3,2,2,3], val = 3,
 *
 * <p>Your function should return length = 2, with the first two elements of nums being 2.
 *
 * <p>It doesn't matter what you leave beyond the returned length. Example 2:
 *
 * <p>Given nums = [0,1,2,2,3,0,4,2], val = 2,
 *
 * <p>Your function should return length = 5, with the first five elements of nums containing 0, 1,
 * 3, 0, and 4.
 *
 * <p>Note that the order of those five elements can be arbitrary.
 *
 * <p>It doesn't matter what values are set beyond the returned length.
 */
public class Solution_27 {

  // Time: O(N) Memory: O(1)
  public int removeElement(int[] nums, int val) {
    if (nums == null || nums.length == 0 || (nums.length == 1 && nums[0] == val)) {
      return 0;
    }

    int left = 0;
    int right = nums.length - 1;

    while (left <= right && nums[left] != val) {
      left++;
    }

    while (left <= right && nums[right] == val) {
      right--;
    }

    while (left < right) {
      nums[left] = nums[right];
      right--;
      left++;

      while (nums[left] != val && left <= right) {
        left++;
      }

      while (right >= 0 && nums[right] == val && left <= right) {
        right--;
      }
    }

    return left;
  }

  public int removeElement2(int[] nums, int val) {
    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
      if (nums[left] == val) {
        nums[left] = nums[right];
        right--;
      } else {
        left++;
      }
    }
    return right + 1;
  }
}
