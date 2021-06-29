package com.vojik.solutions;

/** 1047. Remove All Adjacent Duplicates In String */
public class Solution_1047 {

  public String removeDuplicates(String s) {
    StringBuilder sb = new StringBuilder(s);
    int right = 0;

    while (right < sb.length()) {
      int left = right - 1;
      while (left >= 0 && right < sb.length() && sb.charAt(left) == sb.charAt(right)) {
        left--;
        right++;
      }
      if (right - left > 1) {
        sb.delete(left + 1, right);
        right = left;
      } else {
        right++;
      }
    }

    return sb.toString();
  }
}
