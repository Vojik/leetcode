package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 594. Longest Harmonious Subsequence
 */
public class Solution_594 {

  // Time: O(n) Space: O(n)
  public int findLHS(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }

    int longest = 0;
    for (Map.Entry el : map.entrySet()) {
      if (map.containsKey((int) el.getKey() + 1)) {
        longest = Math.max(longest, (int) el.getValue() + (int) map.get((int) el.getKey() + 1));
      }
    }
    return longest;
  }
}
