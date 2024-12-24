package com.vojik.solutions;

/**
 * 2109. Adding Spaces to a String
 */
public class Solution_2109 {

  public String addSpaces(String s, int[] spaces) {
    StringBuilder sb = new StringBuilder();
    int spaceIdx = 0;
    for (int i = 0; i < s.length(); i++) {
      if (spaceIdx < spaces.length && i == spaces[spaceIdx]) {
        sb.append(' ');
        spaceIdx++;
      }
      sb.append(s.charAt(i));
    }
    return sb.toString();
  }
}
