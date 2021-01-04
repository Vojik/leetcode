package com.vojik.solutions;

/**
 * 394. Decode String
 */
public class Solution_394 {

  private static int i = 0;

  // Time: O(n) Space: O(n)
  public String decodeString(String s) {
    StringBuilder sb = new StringBuilder();

    for (; i < s.length(); i++) {

      while (i < s.length() && !Character.isDigit(s.charAt(i)) && '[' != s.charAt(i)) {
        sb.append(s.charAt(i));
        i++;
      }

      if (i < s.length()) {
        sb.append(dfs(s));
      }
    }
    i = 0; // NOOOOOOOOOOOOO
    return sb.toString();
  }


  private String dfs(String s) {
    // Find number
    int startNumIdx = i;
    while (i < s.length() && Character.isDigit(s.charAt(i))) {
      i++;
    }
    int num = Integer.parseInt(s.substring(startNumIdx, i));

    i++; // skip '['

    StringBuilder sbStr = new StringBuilder();
    while (i < s.length() && ']' != s.charAt(i)) {
      if (Character.isDigit(s.charAt(i))) {
        sbStr.append(dfs(s));
      } else {
        sbStr.append(s.charAt(i));
      }
      i++;
    }

    StringBuilder result = new StringBuilder();
    for (int j = 0; j < num; j++) {
      result.append(sbStr.toString());
    }
    return result.toString();
  }

}
