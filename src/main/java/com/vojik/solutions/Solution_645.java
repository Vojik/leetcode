package com.vojik.solutions;

/**
 * 645. Set Mismatch
 */
public class Solution_645 {
  // Time: O(2n) = O(n) Space: O(n)
  public int[] findErrorNums(int[] nums) {
    int[] ans = new int[2];
    boolean[] set = new boolean[nums.length + 1];

    for (int i = 0; i < nums.length; i++) {
      if (set[nums[i]]) {
        ans[0] = nums[i];
      } else {
        set[nums[i]] = true;
      }
    }

    for (int i = 1; i < set.length; i++) {
      if (!set[i]) {
        ans[1] = i;
        break;
      }
    }
    return ans;
  }
}
