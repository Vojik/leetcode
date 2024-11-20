package com.vojik.solutions;

/**
 * 921. Minimum Add to Make Parentheses Valid
 */
public class Solution_921 {

  public int minAddToMakeValid(String s) {
    int open = 0;
    int ans = 0;
    for (char ch : s.toCharArray()) {
      if (ch == '(') {
        open++;
      } else if (open == 0) {
        ans++;
      } else {
        open--;
      }
    }
    return ans + open;
  }
}
