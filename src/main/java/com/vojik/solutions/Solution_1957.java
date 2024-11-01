package com.vojik.solutions;


/**
 * 1957. Delete Characters to Make Fancy String
 */
public class Solution_1957 {

  public String makeFancyString(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (i < 2 || (ch != s.charAt(i - 1) || ch != s.charAt(i - 2))) {
        sb.append(ch);
      }
    }
    return sb.toString();
  }
}


