package com.vojik.solutions;

/** 680. Valid Palindrome II */
public class Solution_680 {

  public boolean validPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;
    while (left < right) {
      if (s.charAt(left) != s.charAt(right)) {
        return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
      }
      left++;
      right--;
    }
    return true;
  }

  private boolean isPalindrome(String s, int left, int right) {
    while (left < right) {
      if (s.charAt(left) != s.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
}
