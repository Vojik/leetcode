package com.vojik.solutions;

/**
 * 796. Rotate String
 */
public class Solution_796 {

  public boolean rotateString(String s, String goal) {
    int len = goal.length();
    if (s.length() != len) {
      return false;
    }

    for (int i = 0; i < len; i++) {
      if (s.charAt(i) == goal.charAt(0) && checkStrings(s, goal, i)) {
        return true;
      }
    }
    return false;
  }

  private boolean checkStrings(String s, String goal, int idx) {
    int len = goal.length();
    for (int i = 0; i < len; i++) {
      if (s.charAt(idx % len) != goal.charAt(i)) {
        return false;
      }
      idx++;
    }
    return true;
  }

  public boolean rotateString2(String s, String goal) {
    return s.length() != goal.length() || (s + s).contains(goal);
  }
}
