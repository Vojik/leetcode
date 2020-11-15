package com.vojik.solutions;

/**
 * 283. Move Zeroes
 *
 * <p>Given an array nums, write a function to move all 0's to the end of it while maintaining the
 * relative order of the non-zero elements.
 *
 * <p>Example:
 *
 * <p>Input: [0,1,0,3,12] Output: [1,3,12,0,0]
 * <p>
 * Note:
 * <p>You must do this in-place without making a copy of the array. Minimize the total number of
 * operations.
 */
public class Solution_283 {

  // Time: O(n) Space: O(1)
  public void moveZeroes(int[] nums) {
    if (nums == null) {
      return;
    }
    int zeroPointer = -1;
    int i = 0;

    while (i < nums.length) {
      if (nums[i] != 0) {
        if (zeroPointer >= 0) {
          nums[zeroPointer] = nums[i];
          nums[i] = 0;
          zeroPointer++;
        }
      } else if (zeroPointer < 0) {
        zeroPointer = i;
      }
      i++;
    }
  }

}
