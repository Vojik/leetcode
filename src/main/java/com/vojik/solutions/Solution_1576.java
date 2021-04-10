package com.vojik.solutions;

/**
 * 1576. Replace All ?'s to Avoid Consecutive Repeating Characters
 */
public class Solution_1576 {

  public String modifyString(String s) {
    char[] arr = s.toCharArray();
    for (int i = 0; i < arr.length; i++) {
      if (s.charAt(i) == '?') {
        arr[i] = peekChar(arr, i);
      }
    }
    return new String(arr);
  }

  private char peekChar(char[] arr, int i) {
    char ch = (char) ('a' + (int) (0 + Math.random() * 25));
    if (i > 0 && arr[i - 1] == ch) {
      ch = peekChar(arr, i);
    }
    if (i < arr.length - 1 && arr[i + 1] == ch) {
      ch = peekChar(arr, i);
    }
    return ch;
  }
}
