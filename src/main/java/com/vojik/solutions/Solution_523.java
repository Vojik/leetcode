package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 523. Continuous Subarray Sum
 */
public class Solution_523 {

  public boolean checkSubarraySum(int[] nums, int k) {
    Map<Integer, Integer> modIndex = new HashMap<>();
    modIndex.put(0, -1);
    int prefixMod = 0;
    for (int i = 0; i < nums.length; i++) {
      prefixMod = (prefixMod + nums[i]) % k;
      if (modIndex.containsKey(prefixMod)) {
        if (i - modIndex.get(prefixMod) > 1) {
          return true;
        }
      } else {
        modIndex.put(prefixMod, i);
      }
    }
    return false;
  }
}
