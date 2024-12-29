package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 325. Maximum Size Subarray Sum Equals k
 */
public class Solution_325 {

  public int maxSubArrayLen(int[] nums, int k) {
    int result = 0;
    int prefixSum = 0;
    Map<Integer, Integer> prefixSumToIdx = new HashMap<>();
    prefixSumToIdx.put(0, -1);
    for (int i = 0; i < nums.length; i++) {
      prefixSum += nums[i];
      int candidate = prefixSum - k;
      if (prefixSumToIdx.containsKey(candidate)) {
        result = Math.max(i - prefixSumToIdx.get(candidate), result);
      }
      if (!prefixSumToIdx.containsKey(prefixSum)) {
        prefixSumToIdx.put(prefixSum, i);
      }
    }
    return result;
  }
}
