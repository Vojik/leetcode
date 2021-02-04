package com.vojik.solutions;

/**
 * 14. Longest Common Prefix
 */
public class Solution_14 {

  // Time: O(n*m) Space: O(m)
  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }

    StringBuilder prefix = new StringBuilder(strs[0]);
    for (int i = 1; i < strs.length; i++) {
      String word = strs[i];
      for (int j = 0; j < prefix.length(); j++) {
        if (word.length() == j || prefix.charAt(j) != word.charAt(j)) {
          prefix.delete(j, prefix.length());
        }
      }
      if (prefix.length() == 0) {
        return "";
      }
    }
    return prefix.toString();
  }
}
