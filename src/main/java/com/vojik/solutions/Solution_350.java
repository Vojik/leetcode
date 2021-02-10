package com.vojik.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 350. Intersection of Two Arrays II
 */
public class Solution_350 {

  // Time: O(n + m) Space: O(n)
  public int[] intersect(int[] nums1, int[] nums2) {
    if (nums2.length < nums1.length) {
      return intersect(nums2, nums1);
    }

    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums1) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    int[] result = new int[nums1.length];
    int idx = 0;
    for (int num : nums2) {
      if (map.containsKey(num)) {
        int count = map.get(num);
        result[idx++] = num;
        if (count - 1 == 0) {
          map.remove(num);
        } else {
          map.put(num, --count);
        }
      }
    }
    return Arrays.copyOf(result, idx);
  }
}
