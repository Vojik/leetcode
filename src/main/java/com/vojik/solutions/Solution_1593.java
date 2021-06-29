package com.vojik.solutions;

import java.util.HashSet;
import java.util.Set;

/** 1593. Split a String Into the Max Number of Unique Substrings */
public class Solution_1593 {

  private int maxUniqueSplit;

  public int maxUniqueSplit(String s) {
    backtrack(s, 0, new HashSet<>());
    return maxUniqueSplit;
  }

  private void backtrack(String s, int index, Set<String> set) {
    if (s.length() == index) {
      maxUniqueSplit = Math.max(maxUniqueSplit, set.size());
    } else {
      for (int i = index; i < s.length(); i++) {
        String substring = s.substring(index, i + 1);
        if (!set.contains(substring)) {
          set.add(substring);
          backtrack(s, i + 1, set);
          set.remove(substring);
        }
      }
    }
  }
}
