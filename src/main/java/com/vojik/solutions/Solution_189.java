package com.vojik.solutions;

/**
 * 189. Rotate Array
 */
public class Solution_189 {

  public void rotate(int[] nums, int k) {
    if (k == 0 || nums.length == 1) {
      return;
    }
    k = k % nums.length;
    rotate(nums, 0, nums.length - 1);
    rotate(nums, 0, k - 1);
    rotate(nums, k, nums.length - 1);
  }

  private void rotate(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }
}
