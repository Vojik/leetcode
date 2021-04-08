package com.vojik.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 1647. Minimum Deletions to Make Character Frequencies Unique
 */
public class Solution_1647 {

  public int minDeletions(String s) {
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    Set<Integer> freq = new HashSet<>();
    int ans = 0;

    for (int i = 0; i < chars.length; i++) {
      int start = i;
      while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
        i++;
      }
      int diff = i - start + 1;

      while (diff > 0 && freq.contains(diff)) {
        diff--;
        ans++;
      }
      if (diff != 0) {
        freq.add(diff);
      }
    }
    return ans;
  }
}
