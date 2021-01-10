package com.vojik.solutions;

/**
 * Write a function that reverses a string. The input string is given as an array of characters
 * char[].
 *
 * <p>Do not allocate extra space for another array, you must do this by modifying the input array
 * in-place with O(1) extra memory.
 *
 * <p>You may assume all the characters consist of printable ascii characters.
 *
 * <p>Example 1:
 *
 * <p>Input: ["h","e","l","l","o"] Output: ["o","l","l","e","h"] Example 2:
 *
 * <p>Input: ["H","a","n","n","a","h"] Output: ["h","a","n","n","a","H"]
 */
public class Solution_344 {

  // Time: O(n) Space: O(1)
  public void reverseString(char[] s) {
    int left = 0;
    int right = s.length - 1;

    while (left < right) {
      char temp = s[left];
      s[left] = s[right];
      s[right] = temp;
      left++;
      right--;
    }
  }

  // Time: O(n) Space: O(n)
  public void reverseString2(char[] s) {
    helper(s, 0, s.length - 1);
  }

  private void helper(char[] s, int left, int right) {
    if (left >= right) {
      return;
    }
    char temp = s[left];
    s[left] = s[right];
    s[right] = temp;
    helper(s, ++left, --right);
  }
}
