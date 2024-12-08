package com.vojik.solutions;

/**
 * 65. Valid Number
 */
public class Solution_65 {

  public boolean isNumber(String s) {
    boolean[] seen = new boolean[4];
    // seen[0] -> sign + or -
    // seen[1] -> dot
    // seen[2] -> exponent
    // seen[3] -> digit
    int len = s.length();

    for (int i = 0; i < len; i++) {
      char c = s.charAt(i);
      if (c == '+' || c == '-') {
        if (seen[0] || i > 0) {
          return false;
        }
        seen[0] = true;
      } else if (c == '.') {
        if (seen[1] || (i == len - 1 && !seen[3])) {
          return false;
        }
        seen[1] = true;
      } else if (c == 'e' || c == 'E') {
        if (seen[2] || !seen[3]) {
          return false;
        }
        return handleExponent(s, i + 1);
      } else if (Character.isDigit(c)) {
        seen[3] = true;
      } else {
        return false;
      }
    }
    return seen[3];
  }

  private boolean handleExponent(String s, int i) {
    if (i == s.length()) {
      return false;
    }
    if (s.charAt(i) == '+' || s.charAt(i) == '-') {
      i++;
    }
    boolean hasDigit = false;
    while (i < s.length() && Character.isDigit(s.charAt(i))) {
      i++;
      hasDigit = true;
    }
    return i == s.length() && hasDigit;
  }
}
