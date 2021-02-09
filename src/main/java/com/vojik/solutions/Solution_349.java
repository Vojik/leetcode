package com.vojik.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 349. Intersection of Two Arrays
 */
public class Solution_349 {

  public int[] intersection(int[] nums1, int[] nums2) {
    if (nums2.length < nums1.length) {
      return intersection(nums2, nums1);
    }

    Set<Integer> set = new HashSet<>();
    for (int n : nums1) {
      set.add(n);
    }

    int[] result = new int[nums1.length];
    int idx = 0;
    for (int n : nums2) {
      if (set.contains(n)) {
        result[idx++] = n;
        set.remove(n);
      }
    }
    return Arrays.copyOf(result, idx);
  }

}
