package com.vojik.solutions;

/**
 * 541. Reverse String II
 */
public class Solution_541 {

  public String reverseStr(String s, int k) {
    char[] array = s.toCharArray();

    int left = 0;
    int len = array.length;

    while (left < len) {
      helper(array, left, left + k - 1);
      left += 2 * k;
    }
    return String.valueOf(array);

  }

  private void helper(char[] s, int left, int right) {
    while (right >= s.length) {
      right--;
    }
    while (left < right) {
      char temp = s[left];
      s[left] = s[right];
      s[right] = temp;
      left++;
      right--;
    }
  }
}
