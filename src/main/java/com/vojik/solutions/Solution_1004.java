package com.vojik.solutions;

/** 1004. Max Consecutive Ones III */
public class Solution_1004 {

  public int longestOnes(int[] nums, int k) {
    int left = 0;
    int right = 0;
    int max = 0;

    while (right < nums.length) {
      if (nums[right] == 0) {
        k--;
        if (k < 0) {
          while (nums[left] != 0) {
            left++;
          }
          left++;
          k++;
        }
      }
      max = Math.max(max, right - left + 1);
      right++;
    }
    return max;
  }
}
