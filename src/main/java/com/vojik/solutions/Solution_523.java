package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/** 523. Continuous Subarray Sum */
public class Solution_523 {

  public boolean checkSubarraySum(int[] nums, int k) {
    Map<Integer, Integer> modIndex = new HashMap<>();
    modIndex.put(0, -1);
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if (k != 0) sum %= k;
      if (modIndex.containsKey(sum)) {
        if (i - modIndex.get(sum) > 1) {
          return true;
        }
      } else {
        modIndex.put(sum, i);
      }
    }
    return false;
  }
}
