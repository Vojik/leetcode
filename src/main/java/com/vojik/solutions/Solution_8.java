package com.vojik.solutions;

/** 8. String to Integer (atoi) */
public class Solution_8 {

  public int myAtoi(String s) {
    int result = 0;
    int len = s.length();
    int i = 0;
    boolean positive = true;
    while (i < len && s.charAt(i) == ' ') {
      i++;
    }

    if (i < len && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
      positive = s.charAt(i++) == '+';
    }
    while (i < len && Character.isDigit(s.charAt(i))) {
      int next = (int) (s.charAt(i++) - '0');
      if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10
          && next > Integer.MAX_VALUE % 10)) {
        return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
      }
      result = result * 10 + next;
    }
    return positive ? result : -result;
  }
}
