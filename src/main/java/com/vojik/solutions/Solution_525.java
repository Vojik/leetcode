package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/** 525. Contiguous Array */
public class Solution_525 {

  // Time complexity: O(N)
  // Space: O(N)
  public int findMaxLength(int[] nums) {
    int ans = 0;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i] == 0 ? -1 : 1;
      if (map.containsKey(sum)) {
        int left = map.get(sum);
        ans = Math.max(ans, i - left);
      } else {
        map.put(sum, i);
      }
    }
    return ans;
  }
}
