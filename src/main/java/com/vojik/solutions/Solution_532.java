package com.vojik.solutions;

import java.util.Arrays;

/**
 * 532. K-diff Pairs in an Array
 */
public class Solution_532 {

  // Time: O(NlogN) Space: O(N)
  public int findPairs(int[] nums, int k) {
    Arrays.sort(nums);
    int len = nums.length;
    int res = 0;
    for (int i = 0; i < len; i++) {

      for (int j = i + 1; j < len; j++) {
        if (nums[j] - nums[i] == k) {
          res++;
          while (i < len - 1 && nums[i] == nums[i + 1]) {
            i++;
          }
          break;
        } else if (nums[i] + k < nums[j]) {
          break;
        }
      }
    }
    return res;
  }
}
