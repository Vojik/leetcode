package com.vojik.solutions;

/**
 * 28. Implement strStr()
 */
public class Solution_28 {

  public int strStr(String haystack, String needle) {
    if (needle.isBlank()) {
      return 0;
    }
    for (int i = 0; i <= haystack.length() - needle.length(); i++) {
      for (int j = 0; j < needle.length() && haystack.charAt(j + i) == needle.charAt(j); j++) {
        if (j == needle.length() - 1) {
          return i;
        }
      }
    }
    return -1;
  }
}
