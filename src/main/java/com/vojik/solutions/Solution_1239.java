package com.vojik.solutions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 1239. Maximum Length of a Concatenated String with Unique Characters
 */
public class Solution_1239 {

  public int maxLength(List<String> arr) {
    return backtracking(arr, 0, new StringBuilder(), 0);
  }

  private int backtracking(List<String> arr, int idx, StringBuilder sb, int max) {
    if (idx == arr.size()) {
      return Math.max(max, sb.length());
    } else {
      for (int i = idx; i < arr.size(); i++) {
        String str = arr.get(i);
        if (!validToAdd(sb, str)) {
          max = Math.max(max, sb.length());
          continue;
        }
        sb.append(str);
        max = backtracking(arr, i + 1, sb, max);
        sb.delete(sb.length() - str.length(), sb.length());
      }
      return max;
    }
  }

  private boolean validToAdd(StringBuilder sb, String str) {
    Set<Character> set = new HashSet<>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (set.contains(ch)) {
        return false;
      }
      if (sb.indexOf(String.valueOf(ch)) >= 0) {
        return false;
      }
      set.add(ch);
    }
    return true;
  }
}
