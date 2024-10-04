package com.vojik.solutions;

/**
 * 2219. Maximum Sum Score of Array
 */
public class Solution_2219 {

  public long maximumSumScore(int[] nums) {
    long rightSum = 0;
    long ans = Long.MIN_VALUE;
    for (int n : nums) {
      rightSum += n;
    }

    long leftSum = 0;
    for (int i = 0; i < nums.length; i++) {
      leftSum += nums[i];
      if (i > 0) {
        rightSum -= nums[i - 1];
      }
      ans = Math.max(ans, Math.max(leftSum, rightSum));
    }
    return ans;
  }

}
