package com.vojik.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. Contains Duplicate
 */
public class Solution_217 {

  public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int n : nums) {
      if (set.contains(n)) {
        return true;
      }
      set.add(n);
    }
    return false;
  }
}
