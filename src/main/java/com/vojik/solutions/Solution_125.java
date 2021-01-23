package com.vojik.solutions;

/**
 * 125. Valid Palindrome
 */
public class Solution_125 {

  public boolean isPalindrome(String s) {
    if (s == null || s.isBlank()) {
      return true;
    }

    int start = 0;
    int end = s.length() - 1;
    s = s.toLowerCase();

    while (start < end) {

      if (!Character.isLetterOrDigit(s.charAt(start))) {
        start++;
      } else if (!Character.isLetterOrDigit(s.charAt(end))) {
        end--;
      } else {
        if (s.charAt(start) != s.charAt(end)) {
          return false;
        }
        start++;
        end--;
      }
    }
    return true;
  }
}