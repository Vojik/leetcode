package com.vojik.solutions;

/**
 * Given an integer array nums, find the contiguous subarray within an array (containing at least
 * one number) which has the largest product.
 *
 * <p>Example 1:
 *
 * <p>Input: [2,3,-2,4] Output: 6 Explanation: [2,3] has the largest product 6. Example 2:
 *
 * <p>Input: [-2,0,-1] Output: 0 Explanation: The result cannot be 2, because [-2,-1] is not a
 * subarray.
 */
public class Solution_152 {

  // O(n)
  public static int solution1(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int result = nums[0];
    int currMin = nums[0];
    int currMax = nums[0];
    for (int i = 1; i < nums.length; i++) {
      int nextMax = nums[i] * currMax;
      int nextMin = nums[i] * currMin;

      // currMax = Math.max(nums[i], nums[i]*currMax, nums[i]*currMin)
      // currMin = Math.min(nums[i], nums[i]*currMax, nums[i]*currMin)
      currMax = Math.max(nums[i], Math.max(nextMax, nextMin));
      currMin = Math.min(nums[i], Math.min(nextMax, nextMin));
      result = Math.max(result, currMax);
    }
    return result;
  }

  // O(n^2)
  public static int solution2(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      int tempProduct = 1;
      for (int j = i; j < nums.length; j++) {
        tempProduct *= nums[j];
        largest = Math.max(tempProduct, largest);
      }
    }
    return largest;
  }
}
