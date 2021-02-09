package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 219. Contains Duplicate II
 */
public class Solution_219 {

  public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        int j = map.get(nums[i]);
        if (i - j <= k) {
          return true;
        }
      }
      map.put(nums[i], i);
    }
    return false;
  }
}
