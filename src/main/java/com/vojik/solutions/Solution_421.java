package com.vojik.solutions;

/**
 * 421. Maximum XOR of Two Numbers in an Array
 */
public class Solution_421 {

  // Time: O(n^2)
  // Space: O(1)
  public int findMaximumXOR(int[] nums) {
    int ans = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      for (int j = i; j < nums.length; j++) {
        ans = Math.max(ans, nums[i] ^ nums[j]);
      }
    }
    return ans;
  }
}
