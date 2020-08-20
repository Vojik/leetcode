package com.vojik.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single
 * one.
 * <p>Note:
 * <p>Your algorithm should have a linear runtime complexity. Could you implement it without using
 * extra memory?
 *
 * <p>Example 1:
 * <p>Input: [2,2,1] Output: 1 Example 2:
 * <p>Input: [4,1,2,1,2] Output: 4
 */
public class Solution_136 {

  // Time: O(n) Memory: O(n)
  public static int singleNumber(int[] nums) {
    final Set<Integer> set = new HashSet();
    for (int num : nums) {
      if (set.contains(num)) {
        set.remove(num);
      } else {
        set.add(num);
      }
    }
    return set.iterator().next();
  }
}
