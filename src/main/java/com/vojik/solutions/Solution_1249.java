package com.vojik.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1249. Minimum Remove to Make Valid Parentheses
 */
public class Solution_1249 {

  // Time: O(n) Space: O(n)
  public String minRemoveToMakeValid(String s) {
    StringBuilder sb = new StringBuilder();
    Deque<Integer> stack = new ArrayDeque<>();

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch == '(') {
        stack.push(sb.length());
      } else if (ch == ')') {
        if (stack.isEmpty()) {
          continue;
        }
        stack.pop();
      }
      sb.append(ch);
    }

    while (!stack.isEmpty()) {
      sb.deleteCharAt(stack.pop());
    }

    return sb.toString();
  }
}
