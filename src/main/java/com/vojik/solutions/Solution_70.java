package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 70. Climbing Stairs
 */
public class Solution_70 {

  // Time: O(n) Size: O(n)
  public int climbStairs(int n) {
    Map<Integer, Integer> cache = new HashMap<>();
    return helper(0, n, cache);
  }

  private int helper(int num, int target, Map<Integer, Integer> cache) {
    if (cache.containsKey(num)) {
      return cache.get(num);
    }
    if (num == target) {
      return 1;
    }
    if (num > target) {
      return 0;
    }
    int res = helper(num + 1, target, cache) + helper(num + 2, target, cache);
    cache.put(num, res);
    return res;
  }
}
