package com.vojik.solutions;

/** 560. Subarray Sum Equals K */
public class Solution_560 {

  public int subarraySum(int[] nums, int k) {
    // time: O(n^2)
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      int sum = 0;
      for (int j = i; j < nums.length; j++) {
        sum += nums[j];
        if (sum == k) {
          count++;
        }
      }
    }
    return count;
  }
}