package com.vojik.solutions;

import java.util.Stack;

/**
 * 394. Decode String
 */
public class Solution_394 {

  private static int i = 0;

  // Time: O(n) Space: O(n)
  public String decodeString2(String s) {
    Stack<Integer> counts = new Stack<>();
    Stack<String> result = new Stack<>();
    result.push("");
    int i = 0;

    while (i < s.length()) {
      if (Character.isDigit(s.charAt(i))) {
        int num = 0;
        while (Character.isDigit(s.charAt(i))) {
          num = num * 10 + s.charAt(i) - '0';
          i++;
        }
        counts.push(num);
        continue;
      } else if ('[' == s.charAt(i)) {
        result.push("");
      } else if (']' == s.charAt(i)) {
        int num = counts.pop();
        String str = result.pop();
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < num; j++) {
          sb.append(str);
        }
        result.push(result.pop() + sb.toString());
      } else {
        result.push(result.pop() + s.charAt(i));
      }
      i++;
    }
    return result.pop();
  }

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
