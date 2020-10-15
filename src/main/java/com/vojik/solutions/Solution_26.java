package com.vojik.solutions;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only
 * once and returns the new length.
 *
 * <p>Do not allocate extra space for another array, you must do this by modifying the input array
 * in-place with O(1) extra memory.
 *
 * <p>Example 1:
 *
 * <p>Given nums = [1,1,2],
 *
 * <p>Your function should return length = 2, with the first two elements of nums being 1 and 2
 * respectively.
 *
 * <p>It doesn't matter what you leave beyond the returned length. Example 2:
 *
 * <p>Given nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * <p>Your function should return length = 5, with the first five elements of nums being modified
 * to
 * 0, 1, 2, 3, and 4 respectively.
 *
 * <p>It doesn't matter what values are set beyond the returned length. Clarification:
 *
 * <p>Confused why the returned value is an integer but your answer is an array?
 *
 * <p>Note that the input array is passed in by reference, which means a modification to the input
 * array will be known to the caller as well.
 *
 * <p>Internally you can think of this:
 *
 * <p>// nums is passed in by reference. (i.e., without making a copy) int len =
 * removeDuplicates(nums);
 *
 * <p>// any modification to nums in your function would be known by the caller. // using the
 * length
 * returned by your function, it prints the first len elements. for (int i = 0; i < len; i++) {
 * print(nums[i]); }
 */
public class Solution_26 {

  public int removeDuplicates(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int left = 0;
    int right = 0;
    int lastValue = Integer.MIN_VALUE;

    while (right < nums.length) {
      if (nums[left] > lastValue) {
        lastValue = nums[left];
        left++;
        right++;
        continue;
      }

      if (left != right && nums[right] > lastValue) {
        nums[left] = nums[right];
        lastValue = nums[left];
        left++;
      }
      right++;
    }

    return left;
  }

  public int removeDuplicates2(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int left = 0;
    int right = 0;
    while (right < nums.length) {
      int val = nums[right];
      while (right < nums.length && val == nums[right]) {
        right++;
      }
      nums[left] = val;
      left++;
    }

    return left;
  }
}
