package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 2215. Find the Difference of Two Arrays
 */
public class Solution_2215 {

  public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    return List.of(helper(nums1, nums2), helper(nums2, nums1));
  }

  private List<Integer> helper(int[] nums1, int[] nums2) {
    Set<Integer> inNums2 = new HashSet<>();
    for (int n : nums2) {
      inNums2.add(n);
    }

    Set<Integer> distinctInNums1 = new HashSet<>();
    for (int n : nums1) {
      if (!inNums2.contains(n)) {
        distinctInNums1.add(n);
      }
    }
    return new ArrayList<>(distinctInNums1);
  }
}
