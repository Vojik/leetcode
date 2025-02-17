package com.vojik.solutions;

import java.util.HashSet;
import java.util.Set;

/** 128. Longest Consecutive Sequence */
public class Solution_128 {

  // Time complexity: O(N)
  // Space complexity: O(N)
  public int longestConsecutive(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int n : nums) {
      set.add(n);
    }

    int max = 0;
    for (int n : set) {
      if (!set.contains(n - 1)) {
        int curNum = n;
        int curLongerst = 1;

        while (set.contains(curNum + 1)) {
          curNum = curNum + 1;
          curLongerst++;
        }
        max = Math.max(max, curLongerst);
      }
    }
    return max;
  }
}
