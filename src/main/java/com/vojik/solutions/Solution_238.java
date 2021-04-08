package com.vojik.solutions;

/**
 * 238. Product of Array Except Self
 */
public class Solution_238 {

  // Time: O(n + n) = O(n)
  // Space: O(n)
  public int[] productExceptSelf(int[] nums) {
    int zeroIdx = -1;
    long product = 1;
    int[] answer = new int[nums.length];

    // find the product of ALL the elements of nums
    // find zero index if exist
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        if (zeroIdx == -1) {
          zeroIdx = i;
          continue;
        } else {
          return answer;
        }
      }
      product *= nums[i];
    }

    // when 1 zero element exists
    if (zeroIdx != -1) {
      answer[zeroIdx] = (int) product;
      return answer;
    }

    // populate the answer
    for (int i = 0; i < nums.length; i++) {
      answer[i] = (int) product / nums[i];
    }

    return answer;
  }

  public int[] productExceptSelfFollowUp(int[] nums) {
    int[] answer = new int[nums.length];
    answer[0] = 1;
    for (int i = 1; i < nums.length; i++) {
      answer[i] = answer[i - 1] * nums[i - 1];
    }

    int right = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      answer[i] = answer[i] * right;
      right *= nums[i];
    }

    return answer;
  }
}
