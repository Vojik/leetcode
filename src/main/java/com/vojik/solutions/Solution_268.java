package com.vojik.solutions;

import java.util.Arrays;

/**
 * 268. Missing Number
 */
public class Solution_268 {

  // Time: O(nlog(n) + n)
  // Space: O(1)
  public int missingNumber(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      if (i != nums[i]) {
        return i;
      }
    }
    return nums.length;
  }

  // Time: O(n)
  // Space: O(1)
  public int missingNumber2(int[] nums) {
    int ans = nums.length;
    for (int i = 0; i < nums.length; i++) {
      while (i != nums[i]) {
        if (nums[i] == nums.length) {
          ans = i;
          break;
        }
        swap(nums, i, nums[i]);
      }
    }
    return ans;
  }

  public int missingNumber3(int[] nums) {
    int n = nums.length;
    int expectedSum = 0;
    int actualSum = 0;
    for (int i = 0; i < n; i++) {
      expectedSum += i;
      actualSum += nums[i];
    }
    expectedSum += n;
    return expectedSum - actualSum;
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
