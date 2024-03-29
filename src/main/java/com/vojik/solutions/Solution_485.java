package com.vojik.solutions;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 *
 * <p>Example 1: Input: [1,1,0,1,1,1] Output: 3 Explanation: The first two digits or the last three
 * digits are consecutive 1s. The maximum number of consecutive 1s is 3. Note:
 *
 * <p>The input array will only contain 0 and 1. The length of input array is a positive integer and
 * will not exceed 10,000
 */
public class Solution_485 {
  public int findMaxConsecutiveOnes(int[] nums) {
    int result = 0;
    int current = 0;
    for (int n : nums) {
      if (n == 1) {
        current++;
      } else {
        result = Math.max(result, current);
        current = 0;
      }
    }
    return Math.max(result, current);
  }
}
