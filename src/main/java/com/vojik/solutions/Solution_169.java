package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 169. Majority Element
 */
public class Solution_169 {

  public int majorityElement(int[] nums) {
    Map<Integer, Integer> freq = new HashMap<>();
    for (int n : nums) {
      freq.put(n, freq.getOrDefault(n, 0) + 1);
    }

    int maxSoFarCount = freq.get(nums[0]);
    int maxSoFarNum = nums[0];
    for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
      if (maxSoFarCount < entry.getValue()) {
        maxSoFarCount = entry.getValue();
        maxSoFarNum = entry.getKey();
      }
    }
    return maxSoFarNum;
  }
}
