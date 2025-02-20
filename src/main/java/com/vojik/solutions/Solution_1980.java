package com.vojik.solutions;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 1980. Find Unique Binary String
 */
public class Solution_1980 {

  private String ans;

  public String findDifferentBinaryString(String[] nums) {
    int n = nums.length;
    Set<String> set = new HashSet<>();
    Collections.addAll(set, nums);
    findCombination(n, "", set);
    return ans;
  }

  private void findCombination(int n, String currentStr, Set<String> set) {
    if (currentStr.length() == n) {
      if (!set.contains(currentStr)) {
        ans = currentStr;
      }
    } else {
      if (ans != null) {
        return;
      }
      findCombination(n, currentStr + "0", set);
      findCombination(n, currentStr + "1", set);
    }
  }
}
