package com.vojik.solutions;

/**
 * 5. Longest Palindromic Substring
 */
public class Solution_5 {

  public String longestPalindrome(String s) {
    int[] ar = new int[]{0, 0};
    for (int i = 0; i < s.length(); i++) {
      int len1 = longestPalindrome(s, i, i);
      if (len1 > ar[1] - ar[0] + 1) {
        int dist = len1 / 2;
        ar[0] = i - dist;
        ar[1] = i + dist;
      }

      int len2 = longestPalindrome(s, i, i + 1);
      if (len2 > ar[1] - ar[0] + 1) {
        int dist = (len2 / 2) - 1;
        ar[0] = i - dist;
        ar[1] = i + 1 + dist;
      }
    }
    return s.substring(ar[0], ar[1] + 1);
  }

  private int longestPalindrome(String s, int left, int right) {
    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
      left--;
      right++;
    }
    return right - left - 1;
  }
}
