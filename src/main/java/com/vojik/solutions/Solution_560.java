package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/** 560. Subarray Sum Equals K */
public class Solution_560 {

  // Time complexity: O(n^2)
  // Space complexity: O(1)
  public int subarraySum(int[] nums, int k) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      int sum = 0;
      for (int j = i; j < nums.length; j++) {
        sum += nums[j];
        if (sum == k) {
          count++;
        }
      }
    }
    return count;
  }

  // Time complexity: O(n)
  // Space complexity: O(n)
  public int subarraySum2(int[] nums, int k) {
    Map<Integer, Integer> freq = new HashMap<>();
    freq.put(0, 1);

    int result = 0;
    int prefixSum = 0;
    for (int num : nums) {
      prefixSum += num;
      Integer count = freq.get(prefixSum - k);
      if (count != null) {
        result += count;
      }
      freq.put(prefixSum, freq.getOrDefault(prefixSum, 0) + 1);
    }
    return result;
  }
}
