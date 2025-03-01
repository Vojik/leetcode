package com.vojik.solutions;

/**
 * 2460. Apply Operations to an Array
 */
public class Solution_2460 {

  public int[] applyOperations(int[] nums) {
    int len = nums.length;
    int[] ans = new int[len];
    int j = 0;
    for (int i = 0; i < len - 1; i++) {
      if (nums[i] == nums[i + 1]) {
        nums[i] *= 2;
        nums[i + 1] = 0;
      }
      if (nums[i] != 0) {
        ans[j++] = nums[i];
      }
    }
    if (nums[len - 1] != 0) {
      ans[j] = nums[len - 1];
    }
    return ans;
  }
}
