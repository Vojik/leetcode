package com.vojik.solutions;

/** 75. Sort Colors */
public class Solution_75 {

  public void sortColors(int[] nums) {
    int lastIdx = sortColor(nums, 0, 0);
    lastIdx = sortColor(nums, 1, lastIdx);
    sortColor(nums, 2, lastIdx);
  }

  private int sortColor(int[] nums, int color, int startIdx) {
    int lastIdx = startIdx;
    for (int i = startIdx; i < nums.length; i++) {
      if (nums[i] == color) {
        swap(nums, i, lastIdx++);
      }
    }
    return lastIdx;
  }

  private void swap(int[] nums, int i, int j) {
    int t = nums[i];
    nums[i] = nums[j];
    nums[j] = t;
  }
}
